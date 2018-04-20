/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/
package org.projecthaystack.bmp.platformbus;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.UUID;

public class BMPV2PBInterface extends BMPv2_PlatformBus
{

   public boolean flag ;
   public String response ;

/*
* This function is used to create the instance of BMPV2PBInterface
*/    
   private static BMPV2PBInterface single_instance = null;
   public static BMPV2PBInterface bmpPBInstance()
   {  
        if(single_instance == null)
        {
          single_instance = new BMPV2PBInterface();
        }
      return single_instance;
   }  
//////////////////////////////////////////////////////////////////////////
// Construction
//////////////////////////////////////////////////////////////////////////

   private BMPV2PBInterface()
   {
     super("haystack");
     this.flag = false;
     this.response = "";
   }
   
   /*
   * This function is used to write data to Meta-Database
   * @param str the data to be added to Meta DB
   * @param ops the operation to be performed by Database
   */
   public void onPublish(String str,String ops)//
   {  
      String reqId = UUID.randomUUID().toString();
      JSONObject payload = new JSONObject();
      payload.put("reqid", reqId);
      payload.put("operation", ops);
      payload.put("parameters", str);
      
      super.pbus_send("meta",payload.toJSONString()); 
   }  


   /*
   * This function is the definition of abstract function in Platform Bus class
   * @param 
   */  
   public void pbus_onreceive(String source,String payload)
   { 
      try
      { 
       source.toLowerCase();
       if(source.contains("meta"))
       {
         readStatusForMetaStore(payload);
       }
      }
      catch(ParseException pe)
      {}  
       //else if(topic.contains("telemetry"))
       //{
           
       //}
   }
   /*
   * This function is used to read the status of addOp to MetaDB
   * @param status is used to store the return status from MDB
   */
   public void readStatusForMetaStore(String payload) throws ParseException
   {
      String status = "", reqId = "";
      JSONParser parser = new JSONParser();
      Object object = parser.parse(payload);
      JSONObject jsonObject = (JSONObject)object;
      reqId = (String)jsonObject.get("reqid");
      status = (String)jsonObject.get("status");
      if(status.contains("OK"))
      {
        this.response = "OK";
        this.flag = true;
      }    
      else 
      {
        this.response = "fault";
        this.flag = true;
      }
   }    
}
