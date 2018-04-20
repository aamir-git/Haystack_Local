/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/

package org.projecthaystack.server;

import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.projecthaystack.*;
import org.projecthaystack.io.*;

 /**
 *  BMPV2StdOps defines the custom operations for 
 *  adding Site, Equipment, and Point 
 */

public class BMPV2StdOps
{

  /** List the registered operations. */
  public static final HOp addSite = new AddSite();

  /** List the registered operations. */
  public static final HOp addEquip = new AddEquip();  
  
  /** List the registered operations. */
  public static final HOp addPoint = new AddPoint();

}

//////////////////////////////////////////////////////////////////////////
//////  Adding Site
//////////////////////////////////////////////////////////////////////////
class AddSite extends HOp
{
  public String name() { return "addSite";}
  public String summary() { return " Adding a site ";}
  public HGrid onService(BMPV2Server db,HGrid req) throws Exception
  {
     if(req.isEmpty()){throw new Exception ("Empty Request\n");}
      HRow row= req.row(0);
      String site = row.getStr("site");
      String city = row.getStr("city");
      String state = row.getStr("state");
      int area = row.getInt("area");
      String markers = row.getStr("markers");
      String status = "";
     if(row.size() > 5)
      {
           status = "Error, Extra or Invalid Keys for Equipment ";
           return HGridBuilder.dictToGrid(db.addSite(status));
      }
     try
     {
        BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
        status = adOp.addHandler(site,city,state,area,markers);
     }
     catch(NullPointerException e)
     {
        System.out.println("Object creation failed BMPV2StdOps");
     }
      return HGridBuilder.dictToGrid(db.addSite(status));
   }
}

//////////////////////////////////////////////////////////////////////////
//////  Adding Equip
//////////////////////////////////////////////////////////////////////////
class AddEquip extends HOp
{
  public String name() { return "addEquip";}
  public String summary() { return " Adding Equip to a Site ";}
  public HGrid onService(BMPV2Server db,HGrid req) throws Exception
  {
     if(req.isEmpty())throw new Exception ("Empty Request\n");
     HRow row = req.row(0);
     String dis = row.getStr("site");
     String eqId = row.getStr("eqId");
     String id = eqId.toLowerCase();
     String markers = row.getStr("markers");
     String refEquip = "",submeterOf = "",status = "";
     int coolCap = 0;
     if(id.contains("chiller"))
     {
        coolCap = row.getInt("coolCap");
        refEquip = row.getStr("refEquip"); 
        if(row.size() > 5)
        {
           status = "Error, Extra or Invalid Keys for Equipment ";
           return HGridBuilder.dictToGrid(db.addEquip(status));
        }
     }
     else if( id.contains("ahu") || id.contains("coolingtower") ||
              id.contains("heatexchanger") || id.contains("boiler") ||
              id.contains("storagetank"))
     {
        refEquip = row.getStr("refEquip");
        if(row.size() > 4)
        {
           status = "Error, Extra or Invalid Keys for Equipment ";
           return HGridBuilder.dictToGrid(db.addEquip(status));
        }
     }
     else if(id.contains("meter"))
     {
        submeterOf = row.getStr("submeterOf");
        if(row.size() > 4)
        {
           status = "Error, Extra or Invalid Keys for Equipment ";
           return HGridBuilder.dictToGrid(db.addEquip(status));
        }
     }
     try
     {
        BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
        status = adOp.addHandler(dis,eqId,markers,refEquip,submeterOf,coolCap);
     }
     catch(NullPointerException e)
     {
        System.out.println("Object creation failed BMPV2StdOps");
     }
     return HGridBuilder.dictToGrid(db.addEquip(status));
   }
}    

//////////////////////////////////////////////////////////////////////////
//////  Adding Point
//////////////////////////////////////////////////////////////////////////
class AddPoint extends HOp
{
  public String name() {return "addPoint";}
  public String summary() { return "Adding point to an equipment";}
  public HGrid onService(BMPV2Server db,HGrid req) throws Exception
  {
     if(req.isEmpty())throw new Exception ("Empty Request\n");
     HRow row = req.row(0);
     String dis = row.getStr("equip");
     String id = row.getStr("pId");
     String unit = row.getStr("unit");
     String markers = row.getStr("markers");
     String status = "";
     HVal dval = row.get("dval",false);
     try
     {
        BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
        status = adOp.addHandler(dis,id,unit,markers,dval);
     }
     catch(NullPointerException e)
     { 
        status = "";
        throw new Exception("Object creation failed");
     }
     return HGridBuilder.dictToGrid(db.addPoint(status));
  }
}
        
