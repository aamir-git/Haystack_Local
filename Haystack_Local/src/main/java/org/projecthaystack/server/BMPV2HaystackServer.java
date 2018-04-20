/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/
package org.projecthaystack.server;

import java.net.*;
import java.util.*;
import org.projecthaystack.*;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import org.projecthaystack.bmp.platformbus.*;

/**
 * BMPV2HaystackSrever implements haystack server and supports the operations
 */
public class BMPV2HaystackServer extends BMPV2Server
{
	
   private static BMPV2HaystackServer single_instance=null;
   public static BMPV2HaystackServer bmpInstance()
   {  
        if(single_instance==null)
        {
          single_instance = new BMPV2HaystackServer();
        }
      return single_instance;
   }  
//////////////////////////////////////////////////////////////////////////
// Construction
//////////////////////////////////////////////////////////////////////////

  private BMPV2HaystackServer()throws NullPointerException
  {
      validSiteTags();
      pbi = BMPV2PBInterface.bmpPBInstance();
  }   
//////////////////////////////////////////////////////////////////////////
///Handler for custom operations
//////////////////////////////////////////////////////////////////////////

  /**
  * Add handler invokes the specific API to add the Equipment
  * @param dis site Id for adding the Equipment
  * @param id identifies the equipment to be added
  * @param markers are tags to be added
  * @param submeterOf reference to submeter if any
  * @param refEquip has reference to other equipment if any
  * @param coolCap is the cooling capacity of chiller
  * @return -returns the status of operation
  */
  public String addHandler(String dis, String id, String markers, String refEquip,String submeterOf, int coolCap)throws InterruptedException
  {
     String status="",str ="";
     try
     {
       eObj = new BMPV2Equipment();
       String eqId = id.toLowerCase();
       HDict site = (HDict)recs.get(dis);
       if(site == null)
       {
         status = "Error, No Site found with the name '" +dis+ "' ";
         return status;  
       }
       else if((HDict)recs.get(dis+"-"+id) != null)
       {
         status = "Error, Equipment with the name '" +dis+"-"+id+ "' already exists";
         return status;
       }
     
       if(eqId.contains("meter"))
       {
         status = eObj.addMeter(site,dis+"-"+id,markers,submeterOf);
       }
       else if(eqId.contains("ahu")) 
       {
         status = eObj.addAhu(site,dis+"-"+id,markers,refEquip);
       }
       else if(eqId.contains("chiller"))
       {
         status = eObj.addChiller(site,dis+"-"+id,markers,refEquip,coolCap);
       }
       else if(eqId.contains("coolingtower"))
       {
         status = eObj.addCoolingTower(site,dis+"-"+id,markers,refEquip);
       } 
       else if(eqId.contains("chilledwaterplant"))
       {
         status = eObj.addChilledWaterPlant(site,dis+"-"+id,markers);
       }
       else if(eqId.contains("heatexchanger"))
       {
         status = eObj.addHeatExchanger(site,dis+"-"+id,markers,refEquip);
       }
       else if(eqId.contains("boiler"))
       {
         status = eObj.addBoiler(site,dis+"-"+id,markers,refEquip);
       }
       else if(eqId.contains("hotwaterplant"))
       {
         status = eObj.addHotWaterPlant(site,dis+"-"+id,markers);
       }
       else if(eqId.contains("steamplant"))
       {
         status = eObj.addSteamPlant(site,dis+"-"+id,markers);
       }
       else if(eqId.contains("storagetank"))
       {
         status = eObj.addStorageTank(site,dis+"-"+id,markers,refEquip);
       }
       else
       {
         status = "Invalid equipment name ";
       }
     }
     catch(NullPointerException e)
     {
       System.out.println("Object Creation Failed");//will print on log later
       status = "Failed";
     }
    /* if(status.contains("Success"))
     {
      str = toJsonFormat((HDict)recs.get(dis+"-"+id));
      pbi.onPublish(str,"addequip");
      while(pbi.flag == false)
      {
        Thread.sleep(1000);
      }
      if(!(pbi.response.contains("OK")))
      {
        status = "Error, unable to add Point";
      }
      pbi.flag = false;
      pbi.response = "";
     }*/
    return status;
  }

  /**
  * Add handler invokes the API to add the Site
  * @param dis site Id for adding the Site
  * @param geoCity geoCity of Site
  * @param geoState geoState of Site
  * @param area Site area in sq.ft 
  * @param markers valid tags for site
  * @return -returns the status of operation
  */
  public String addHandler(String dis, String geoCity, String geoState, int area, String markers)throws InterruptedException
  {
    String status = "", str = "";
    if((HDict)recs.get(dis)!=null)
    {
      status = "Error, Site with the name '" +dis+ "' already exists";
      return status;
    }
    try
    {
      status = addSite(dis,geoCity,geoState,area,markers);
    }
    catch(UnsupportedOperationException e)
    {
      System.out.println("Unsupported Operation caught");
      status = "Failed";
    }
   /* if(status.contains("Success"))
    {
      str = toJsonFormat((HDict)recs.get(dis));
      pbi.onPublish(str,"addsite");
      while(pbi.flag == false)
      {
        Thread.sleep(1000);
      }
      if(!(pbi.response.contains("OK")))
      {
        status = "Error, unable to add Site";
      }
      pbi.flag = false;
      pbi.response = "";
    }*/
    return status;
  }

  /**
  * Add handler invokes the API to add the Point
  * @param dis equip Id for adding the point
  * @param id id of the point to be added
  * @param markers -are tags to be added
  * @param unit is the unit of measurement
  * @return -returns the status of operation
  */
  public String addHandler(String dis, String id, String unit, String markers, HVal dval)throws InterruptedException
  {
      String status = "", response = "",str="";
      HDict equip = (HDict)recs.get(dis);
      if(equip == null)
      {
         status = "Error, Equipment with the id "+dis+" is not found";
         return status;
      }
      else if((HDict)recs.get(dis+"-"+id) != null)
      {
        status = "Error, Point with the name '" +dis+"-"+id+ "' already exists";
        return status;
      }
      status = addPoint(equip,dis+"-"+id,unit,markers,dval);
    /*  if(status.contains("Success"))
      {
        str = toJsonFormat((HDict)recs.get(dis+"-"+id));
        pbi.onPublish(str,"addpoint");
        while(pbi.flag == false)
        {
          Thread.sleep(1000);
        }
        if(!(pbi.response.contains("OK")))
        {
          status = "Error, unable to add Point";
        }
        pbi.flag = false;
        pbi.response = "";
      }*/
    return status;
  }

  /**
  * This method creates a site with tax taxonomy of Haystack
  * @param dis site Id for adding the Site
  * @param geoCity geoCity of Site
  * @param geoState geoState of Site
  * @param area Site area in sq.ft 
  * @param markers valid tags for site
  * @return -returns the status of operation
  */
  private String addSite(String dis, String geoCity, String geoState, int area, String markers) throws UnsupportedOperationException
  {
    String status = "";
    String suid = UUID.randomUUID().toString();
    HDictBuilder site = new HDictBuilder()
      .add("id",       HRef.make(suid))
      .add("dis",      dis)
      .add("geoCity",  geoCity)
      .add("geoState", geoState)
      .add("geoAddr",  "" +geoCity + "," + geoState)
      .add("area",     HNum.make(area, "ft\u00B2"))
      .add("tz" , HTimeZone.DEFAULT.name);
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(siteTags.contains(tag))
       {
         site.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag " +tag;
         return status;  
       }
    } 
    recs.put(dis,site.toDict());
    HDict validSite = (HDict)recs.get(dis);
    if(validSite.has("site"))
    {
        status = "Success, Site id " +(((HDict)recs.get(dis)).id().toCode());
        return status;
    }
    else
    {
        recs.remove(dis);
        status = "Error, A Site should have a 'site' tag";
        return status;
    }
  }

  /**
  * This method creates the point with the Haystack tag taxonomy
  * @param equip reference to equipment for adding the point 
  * @param dis id of the point to be added
  * @param unit unit of the point
  * @param markers markers are tags to be assigned to the point 
  * @return -returns the status of operation
  */
  private String addPoint(HDict equip, String dis, String unit, String markers, HVal dVal)
  {
    String status = "";
    String suid = UUID.randomUUID().toString();
    HDictBuilder point = new HDictBuilder()
      .add("id",       HRef.make(suid))
      .add("dis",      dis)
      .add("point",    HMarker.VAL)
      .add("his",      HMarker.VAL)
      .add("siteRef",  equip.get("siteRef"))
      .add("equipRef", equip.get("id"))
      .add("kind",     unit == null ? "Bool" : "Number")
      .add("tz",HTimeZone.DEFAULT.name);
    if (unit != null) 
    {
      point.add("unit", unit);
    }
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
      point.add(st.nextToken());
    }
    /////new lines
    recs.put(dis,point.toDict());
    HDict wp = (HDict)recs.get(dis);
    if(wp.has("writable"))
    {  
       WriteArray array = new WriteArray();
       for(int i=0;i<16;i++)
       {
          array.val[i] = (HVal)HStr.make("null"); //hacky
          array.who[i] = "null";
       }
       array.val[16] = dVal;
       array.who[16] = "null";
       writeArrays.put(wp.id(),array);
    }
    /////end of recent edit
   // recs.put(dis,point.toDict());
    status = "Success, Site id " +(((HDict)recs.get(dis)).id().toCode());
    return status;
  }

//////////////////////////////////////////////////////////////////////////
// Ops
//////////////////////////////////////////////////////////////////////////

  public HOp[] ops()
  {
    return new HOp[] {
      HStdOps.about,
      BMPV2StdOps.addSite,
      BMPV2StdOps.addEquip,
      BMPV2StdOps.addPoint,
      HStdOps.ops,
      HStdOps.formats,
      HStdOps.read,
      HStdOps.nav,
      HStdOps.pointWrite,
      HStdOps.hisRead,
      HStdOps.invokeAction,
    };
  }
//////////////////////////////////////////////////////////////////////////
// About ops
//////////////////////////////////////////////////////////////////////////

  public HDict onAbout() { return about; }
  private final HDict about = new HDictBuilder()
    .add("serverName",  hostName())
    .add("vendorName", "Haystack Java Toolkit")
    .add("vendorUri", HUri.make("http://project-haystack.org/"))
    .add("productName", "Haystack Java Toolkit")
    .add("productVersion", "2.0.0")
    .add("productUri", HUri.make("http://project-haystack.org/"))
    .toDict();
  private static String hostName()
  {
    try { return InetAddress.getLocalHost().getHostName(); }
    catch (Exception e) { return "Unknown"; }
  }
//////////////////////////////////////////////////////////////////////////
// AddSite Ops
//////////////////////////////////////////////////////////////////////////

  public HDict onAddSite(String status)
  {  
      HDict addSite = new HDictBuilder()
       .add("status", status)
       .toDict();
      return addSite;
  }
  
//////////////////////////////////////////////////////////////////////////
// AddEquip Ops
//////////////////////////////////////////////////////////////////////////
  
  public HDict onAddEquip(String status)
  {     
     HDict addEquip = new HDictBuilder()
      .add("status", status)
      .toDict();
     return addEquip;   
  }
  
//////////////////////////////////////////////////////////////////////////
// AddPoint Ops
//////////////////////////////////////////////////////////////////////////

 public HDict onAddPoint(String status)
 {
   HDict addPoint = new HDictBuilder()
      .add("status", status)
      .toDict();
     return addPoint; 
 }
 
//////////////////////////////////////////////////////////////////////////
// Reads
//////////////////////////////////////////////////////////////////////////

  protected HDict onReadById(HRef id) { return (HDict)recs.get(id.val); }

  protected Iterator iterator() { return recs.values().iterator(); }

//////////////////////////////////////////////////////////////////////////
//// toJsonHDict
//////////////////////////////////////////////////////////////////////////

  public String toJsonFormat(HDict dict)
  {
     Boolean check=true;
     StringBuffer str= new StringBuffer();
     str.append("{");
     for(Iterator it=dict.iterator();it.hasNext();)
     {
         if(check)
         {
           check=false;
         }
         else
         {
           str.append(",");
         }
         Entry entry=(Entry)it.next();
         String name= (String)entry.getKey();
         HVal val= (HVal)entry.getValue();
         str.append(HStr.toCode(name));
         str.append(":");
         if (val == null)
         {
           str.append("null");
         }
         else if (val instanceof HBool)
         {
           str.append(val);
         }
         else str.append(HStr.toCode(val.toJson()));
     }
     str.append("}");
     
     return str.toString();
  }

//////////////////////////////////////////////////////////////////////////
// Navigation
//////////////////////////////////////////////////////////////////////////

  protected HGrid onNav(String navId)
  {
    // test database navId is record id
    HDict base = null;
    if (navId != null) base = readById(HRef.make(navId));
    // map base record to site, equip, or point
    String filter = "site";
    if (base != null)
    {
      if (base.has("site")) filter = "equip and siteRef==" + base.id().toCode();
      else if (base.has("equip")&&base.has("super")) filter = "equip and equipRef=="+base.id().toCode();
      else if (base.has("equip")) filter = "point and equipRef==" + base.id().toCode();
      else filter = "navNoChildren";
    }

    // read children of base record
    HGrid grid = readAll(filter);

    // add navId column to results
    HDict[] rows = new HDict[grid.numRows()];
    Iterator it = grid.iterator();
    for (int i=0; it.hasNext(); ) rows[i++] = (HDict)it.next();
    for (int i=0; i<rows.length; ++i)
      rows[i] = new HDictBuilder().add(rows[i]).add("navId", rows[i].dis()).toDict();
    return HGridBuilder.dictsToGrid(rows);
  }

  protected HDict onNavReadByUri(HUri uri)
  {
    return null;
  }

//////////////////////////////////////////////////////////////////////////
// Watches
//////////////////////////////////////////////////////////////////////////

  protected HWatch onWatchOpen(String dis, HNum lease)
  {
    throw new UnsupportedOperationException();
  }

  protected HWatch[] onWatches()
  {
    throw new UnsupportedOperationException();
  }

  protected HWatch onWatch(String id)
  {
    throw new UnsupportedOperationException();
  }

//////////////////////////////////////////////////////////////////////////
// Point Write
//////////////////////////////////////////////////////////////////////////

  protected HGrid onPointWriteArray(HDict rec)
  {
    WriteArray array = (WriteArray)writeArrays.get(rec.id());
    if (array == null) array = new WriteArray();

    HGridBuilder b = new HGridBuilder();
    b.addCol("level");
    b.addCol("levelDis");
    b.addCol("val");
    b.addCol("who");

    for (int i=0; i<17; ++i)
      b.addRow(new HVal[] {
          HNum.make(i+1),
          HStr.make("" + (i+1)),
          array.val[i],
          HStr.make(array.who[i]),
        });
    return b.toGrid();
  }

  protected HGrid onPointWrite(HDict rec, int level, HVal val, String who, HNum dur, HDict opts)
  {
    System.out.println("onPointWrite: " + rec.dis() + "  " + val + " @ " + level + " [" + who + "]");
    WriteArray array = (WriteArray)writeArrays.get(rec.id());
    if (array == null) writeArrays.put(rec.id(), array = new WriteArray());
    array.val[level-1] = val;
    array.who[level-1] = who;
    HGridBuilder grid = new HGridBuilder();
    grid.addCol("writeVal");
    grid.addCol("writeLevel");
    grid.addCol("writeLevelDis");
    grid.addCol("writeStatus");
    String str1 = "", str2 = ((HVal)HStr.make("null")).toString();
    //b.add("writeStatus");
    //to do is to find the highest priority value to the point and save its value
    for(int i=0;i<17;i++)
    {
      str1 = (array.val[i]).toString();
      if(!(str1.equalsIgnoreCase(str2)))  
      {
        //Hval WriteStatus = getStatusFormProtocolServices; 
        grid.addRow(new HVal[] {
          array.val[i],
          HNum.make(i+1), 
          HStr.make("" + (i+1)),
         // HStr.make(array.who[i]),//status to be updated after PBI
        });
        break; 
      }
    }
    return grid.toGrid();
  }

  class WriteArray
  {
    final HVal[] val = new HVal[17];
    final String[] who = new String[17];
  }

  // hacky, but keep it simple for servlet environment
  HashMap writeArrays = new HashMap();

//////////////////////////////////////////////////////////////////////////
// History
//////////////////////////////////////////////////////////////////////////

  public HHisItem[] onHisRead(HDict entity, HDateTimeRange range)
  {
    // generate dummy 15min data
    ArrayList acc = new ArrayList();
    HDateTime ts = range.start;
    boolean isBool = ((HStr)entity.get("kind")).val.equals("Bool");
    while (ts.compareTo(range.end) <= 0)
    {
      HVal val = isBool ?
        (HVal)HBool.make(acc.size() % 2 == 0) :
        (HVal)HNum.make(acc.size());
      HDict item = HHisItem.make(ts, val);
      if (ts != range.start) acc.add(item);
      ts = HDateTime.make(ts.millis() + 15*60*1000);
    }
    return (HHisItem[])acc.toArray(new HHisItem[acc.size()]);
  }

  public void onHisWrite(HDict rec, HHisItem[] items)
  {
    throw new RuntimeException("Unsupported");
  }

//////////////////////////////////////////////////////////////////////////
// Actions
//////////////////////////////////////////////////////////////////////////

  public HGrid onInvokeAction(HDict rec, String action, HDict args)
  {
    System.out.println("-- invokeAction \"" + rec.dis() + "." + action + "\" " + args);
    return HGrid.EMPTY;
  }

//////////////////////////////////////////////////////////////////////////
// Fields
//////////////////////////////////////////////////////////////////////////

  HashMap recs = new HashMap();
  BMPV2Equipment eObj;
  BMPV2PBInterface pbi; 
  private static ArrayList<String> siteTags = new ArrayList<String>();
 
//////////////////////////////////////////////////////////////////////////
// Functions to add valid tags
//////////////////////////////////////////////////////////////////////////
  
  private static void validSiteTags()
  {
    siteTags.add("site");
    siteTags.add("room");
    siteTags.add("floor");
  }
  
}
