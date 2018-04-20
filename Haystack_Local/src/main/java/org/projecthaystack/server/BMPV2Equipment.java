/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/
package org.projecthaystack.server;

import java.util.UUID;
import java.util.StringTokenizer;
import java.util.ArrayList;
import org.projecthaystack.*;

 /**
 * BMPV2Equipment creates the API's for equipments and Validation checks
 */

public class BMPV2Equipment 
{

//////////////////////////////////////////////////////////////////////////
// Construction
//////////////////////////////////////////////////////////////////////////
   public BMPV2Equipment() throws NullPointerException
   {
       equipTags();
   }

 /**
 * Function to initialize Tag lists.
 */ 
   private void equipTags()
   {
       validAhuTags();
       validChillerTags();
       validChilledWaterPlantTags();
       validCoolingTowerTags();
       validHeatExchangersTags();
       validMeterTags();
       validBoilersTags();
       validHotWaterPlantTags();
       validSteamPlantTags();
       validStorageTanksTags();
   }

  /**
  * This method creates a meter with Haystack tag taxonomy
  * @param site is reference to a valid site for adding meter
  * @param dis is the Id of Meter
  * @param markers are tags to be assigned
  * @param submeter is reference to subMeter if any 
  * @return -returns the status of operation
  */

  public String addMeter(HDict site, String dis, String markers, String submeterOf)throws NullPointerException
  {
    String status = "";
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    HDict subEquip = null;
    boolean equipType = false;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",       HRef.make(suid))
      .add("dis",      dis)
      .add("siteRef",  site.get("id"));
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(meterTags.contains(tag))
       {
          if(tag.equals("elecMeter") || tag.equals("gasMeter") ||
             tag.equals("domesticWaterMeter") || tag.equals("chilledWaterMeter") ||
             tag.equals("condenserWaterMeter") || tag.equals("hotWaterMeter") ||
             tag.equals("makeupWaterMeter") || tag.equals("blowdownWaterMeter") ||
             tag.equals("condensateWaterMeter") || tag.equals("steamMeter"))
          {
             if(equipType == true)
             {
                status = "Error, Meter can have only be a type - elecMeter, gasMeter, domesticMeter, etc ";
                return status;
             }
             equip.add(tag);
             equipType = true;
          }
          equip.add(tag);
       }
       else
       {
          status = "Error, Invalid tag '" +tag+ "' ";
          return status;
       }
    }
    if(equipType == false)
    {
       status = "Error, A meter should have a type  meter tag ";
       return status;
    }
    if(!submeterOf.contains("NA"))
    {  
       subEquip = (HDict)adOp.recs.get(submeterOf);
       if(subEquip != null)
       {
           equip.add("submeterOf", subEquip.get("dis"));
       }
       else 
       {
         status = "Error, No Reference Meter found with id " +submeterOf;
         return status;
       }
    }//else it is main meter
    
    adOp.recs.put(dis, equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("meter"))
    {
        if(validEquip.has("siteMeter") && validEquip.has("submeterOf"))
        {
           adOp.recs.remove(dis);
           status = "Error,A Meter can only be either - siteMeter or subMeter ";
           return status;
        }
        status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
        return status;
    }
    adOp.recs.remove(dis);
    status = "Error, A Meter should have a 'equip and meter' tag";
    return status;
  }

 /**
  * This method creates an AHU with Haystack tag taxonomy
  * @param site is reference to a valid site for adding AHU
  * @param dis is the Id of AHU
  * @param markers are tags to be assigned
  * @param refEquip is reference to Equipment if any 
  * @return - returns the status of operation
  */

  public String addAhu(HDict site, String dis, String markers, String refEquip)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status  = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef",  site.get("id"));
    if(!refEquip.contains("NA"))
    {
       subEquip = (HDict)adOp.recs.get(refEquip);
       if(subEquip != null)
       {
         equip.add("equipRef", subEquip.get("id"));
       }
       else 
       {
         status = "Error, No Reference Equipment found with id " +refEquip;
         return status;
       }
    }
    else
       equip.add("equipRef", "Individual Equipment");
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(ahuTags.contains(tag)) 
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("ahu"))
    {   
        if((validEquip.has("elecHeat")&&validEquip.has("hotWaterHeat"))||
           (validEquip.has("elecHeat")&&validEquip.has("steamHeat")) ||
           (validEquip.has("elecHeat")&&validEquip.has("gasHeat"))   ||
           (validEquip.has("hotWaterHeat")&&validEquip.has("steamHeat"))||
	       (validEquip.has("hotWaterHeat")&&validEquip.has("gasHeat"))||
           (validEquip.has("steamHeat")&&validEquip.has("gasHeat")))
        {
           adOp.recs.remove(dis);
           status = "Error, An Ahu can be only either - elecHeat, hotWaterHeat, steamHeat, gasHeat ";
           return status;
        }
        else if(validEquip.has("chilledWaterCool")&&validEquip.has("dxCool"))    
        {
           adOp.recs.remove(dis);
           status = "Error, An Ahu can only be either - chilledWaterCool, dxCool ";
           return status;
        }   
        else if(validEquip.has("constantVolume")&&validEquip.has("variableVolume"))
        {
           adOp.recs.remove(dis);
           status = "Error, An Ahu can only be either - constantVolume, variableVolume ";
           return status;
        }
        else if((validEquip.has("directZone")&&validEquip.has("vavZone")) || 
                (validEquip.has("directZone")&&validEquip.has("chilledBeamZone")) ||
                (validEquip.has("directZone")&&validEquip.has("multiZone")) ||
                (validEquip.has("vavZone")&&validEquip.has("chilledBeamZone")) ||
                (validEquip.has("vavZone")&&validEquip.has("multiZone")) ||
                (validEquip.has("multiZone")&&validEquip.has("chilledBeamZone"))) 
        {
           adOp.recs.remove(dis);
           status = "Error, An Ahu can only be either - directZone, vavZone, chilledBeamZone, multiZone ";
           return status;
        }        
        else if((validEquip.has("singleDuct")&&validEquip.has("dualDuct")) ||
                (validEquip.has("singleDuct")&&validEquip.has("tripleDuct")) ||
                (validEquip.has("dualDuct")&&validEquip.has("tripleDuct")))
        {
           adOp.recs.remove(dis);
           status = "Error, An Ahu can only be either - singleDuct, dualDuct, tripleDuct ";
           return status;
        }                                            
        status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
        return status;
    }
    adOp.recs.remove(dis);
    status = "Error, An Ahu should have a 'equip and ahu' tag";
    return status;
  }

  /**
  * This method creates a chiller with Haystack tag taxonomy
  * @param site is reference to a valid site for adding chiller
  * @param dis is the Id of chiller
  * @param markers are tags to be assigned
  * @param refEquip is reference to ChilledWaterPlant if any
  * @param coolingCapacity is the capacity of chiller 
  * @return - returns the status of operation
  */

  public String addChiller(HDict site, String dis,String markers,String refEquip,int coolingCapacity)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef", site.get("id"));
    if(!refEquip.contains("NA"))
    {
       subEquip = (HDict)adOp.recs.get(refEquip);       
       if(subEquip != null)
       {
         if(subEquip.has("chilledWaterPlant"))
         {
           equip.add("equipRef", subEquip.get("id"));
         }
         else
         {
           status = "Error, Chiller can be added only to Chilled Water Plant ";
           return status;
         }
       }
       else 
       {
         status = "Error, No Reference Equipment found with id - " +refEquip;
         return status;
       }
    }
    else
       equip.add("equipRef", "Individual Equipment");
    equip.add("coolingCapacity", HNum.make(coolingCapacity, "cm\u00B3"));////
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(chillerTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);//
    if(validEquip.has("equip") && validEquip.has("chiller"))
    {  
       if(validEquip.has("airCooled") && validEquip.has("waterCooled"))
       {
          adOp.recs.remove(dis);
          status = "Error, A Chiller can only be either - airCooled, waterCooled ";
          return status;
       }
       else if((validEquip.has("absorption")&&validEquip.has("reciprocal"))||
           (validEquip.has("absorption")&&validEquip.has("screw")) ||
           (validEquip.has("absorption")&&validEquip.has("centrifugal"))   ||
           (validEquip.has("reciprocal")&&validEquip.has("screw"))||
	       (validEquip.has("reciprocal")&&validEquip.has("centrifugal"))||
           (validEquip.has("screw")&&validEquip.has("centrifugal")))
       {
           adOp.recs.remove(dis);
           status = "Error, A Chiller can only be either  - absorption, screw, centrifugal, reciprocal ";
           return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;   
    }
    adOp.recs.remove(dis);
    status = "Error, A Chiller should have a 'equip and chiller' tag";
    return status;
  }

  /**
  * This method creates a chilled Water Plant with Haystack tag taxonomy
  * @param site is reference to a valid site for adding chilled water plant
  * @param dis is the Id of chilled Water Plant
  * @param markers are tags to be assigned
  * @return - returns the status of operation
  */

  public String addChilledWaterPlant(HDict site, String dis, String markers)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef",  site.get("id"));
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(chilledWaterPlantTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("chilledWaterPlant") && validEquip.has("super"))
    {
       if(validEquip.has("primaryLoop") && validEquip.has("secondaryLoop"))
       {
          adOp.recs.remove(dis);
          status = "Error, A Chilled Water Plant can only be either  - primaryLoop, secondaryLoop ";
          return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Chilled Water Plant should have a 'equip, chilledWaterPlant, and super' tag";
    return status;
  }

  /**
  * This method creates a cooling tower with Haystack tag taxonomy
  * @param site is reference to a valid site for adding cooling tower
  * @param dis is the Id of cooling tower
  * @param markers are tags to be assigned
  * @param refEquip is reference to equipPlant if any 
  * @return - returns the status of operation
  */

  public String addCoolingTower(HDict site, String dis, String markers, String refEquip)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef", site.get("id"));
    if(!refEquip.contains("NA"))
    {  
       subEquip = (HDict)adOp.recs.get(refEquip);
       if(subEquip != null)
       {
         if(subEquip.has("chilledWaterPlant"))
         {
           equip.add("equipRef", subEquip.get("id"));
         }
         else
         {
           status = "Error, Cooling Tower can be added only to Chilled Water Plant ";
           return status;
         }
       }
       else 
       {
         status = "Error, No Reference Equipment found with id - " +refEquip;
         return status;
       }
    }
    else
    {
       equip.add("equipRef", "Individual Equipment");
    }
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(coolingTowerTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("coolingTower"))
    {
       if(validEquip.has("openLoop") && validEquip.has("closedLoop"))
       {
          adOp.recs.remove(dis);
          status = "Error, A Cooling Tower can only be either  - openLoop, closeLoop ";
          return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Cooling Tower should have a 'equip, and coolingTower' tag";
    return status;
  }

  /**
  * This method creates a storage tank with Haystack tag taxonomy
  * @param site is reference to a valid site for adding storage tank
  * @param dis is the Id of storage tank
  * @param markers are tags to be assigned
  * @param refEquip is reference to equipPlant if any 
  * @return - returns the status of operation
  */

  public String addStorageTank(HDict site, String dis, String markers, String refEquip)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef", site.get("id"));
    if(!refEquip.contains("NA"))
    {  
       subEquip = (HDict)adOp.recs.get(refEquip);
       if(subEquip != null)
       {
         if(subEquip.has("hotWaterPlant") || subEquip.has("steamPlant"))
         {
           equip.add("equipRef", subEquip.get("id"));
         }
         else
         {
           status = "Error, Storage Tank can be added only to HotWaterPlant or SteamPlant ";
           return status;
         }
       }
       else 
       {
         status = "Error, No Reference Equipment found with id - " +refEquip;
         return status;
       }
    }
    else
    {
       equip.add("equipRef", "Individual Equipment");
    }
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(storageTanksTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("tank"))
    {
       if((validEquip.has("hotWater")&&validEquip.has("domesticWater")) || 
          (validEquip.has("hotWater")&&validEquip.has("condensateWater")) ||
          (validEquip.has("hotWater")&&validEquip.has("gas")) ||
          (validEquip.has("hotWater")&&validEquip.has("oil")) ||
          (validEquip.has("domesticWater")&&validEquip.has("condensateWater")) ||
          (validEquip.has("domesticWater")&&validEquip.has("gas")) ||
          (validEquip.has("domesticWater")&&validEquip.has("oil")) ||
          (validEquip.has("condensateWater")&&validEquip.has("gas")) ||
          (validEquip.has("condensateWater")&&validEquip.has("oil")) ||
          (validEquip.has("gas")&&validEquip.has("oil"))) 
       {
          adOp.recs.remove(dis);
          status = "Error, A Storage tank can only be of either type - hotWater, domesticWater, condensateWater, gas, oil ";
          return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Storage Tank should have a 'equip, and tank' tag";
    return status;
  }

  /**
  * This method creates a heat exchanger with Haystack tag taxonomy
  * @param site is reference to a valid site for adding heat exchanger
  * @param dis is the Id of heat exchanger
  * @param markers are tags to be assigned
  * @param refEquip is reference to equipPlant if any 
  * @return - returns the status of operation
  */

  public String addHeatExchanger(HDict site, String dis, String markers, String refEquip)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef", site.get("id"));
    if(!refEquip.contains("NA"))
    {  
       subEquip = (HDict)adOp.recs.get(refEquip);
       if(subEquip != null)
       {    
         if(subEquip.has("chilledWaterPlant") || subEquip.has("hotWaterPlant") || subEquip.has("steamPlant"))
         {
           equip.add("equipRef", subEquip.get("id"));
         }
         else
         {
           status = "Error, Heat Exchangers can be added only to ChilledWaterPlant, hotWaterPlant, steamPlant ";
           return status;
         }
       }
       else 
       {
         status = "Error, No Reference Equipment found with id - " +refEquip;
         return status;
       }
    }
    else
    {
      equip.add("equipRef", "Individual Equipment");
    }
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(heatExchangersTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("heatExchanger"))
    {
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Heat Exchanger should have a 'equip, and heatExchanger' tag";
    return status;
  }

 /**
  * This method creates a boiler with Haystack tag taxonomy
  * @param site is reference to a valid site for adding boiler
  * @param dis is the Id of boiler
  * @param markers are tags to be assigned
  * @param refEquip is reference to equipPlant if any 
  * @return - returns the status of operation
  */

  public String addBoiler(HDict site, String dis, String markers, String refEquip)throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    HDict subEquip = null;
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef", site.get("id"));
    if(!refEquip.contains("NA"))
    {  
       subEquip = (HDict)adOp.recs.get(refEquip);
       if(subEquip != null)
       {    
         if(subEquip.has("hotWaterPlant") || subEquip.has("steamPlant"))
         {
           equip.add("equipRef", subEquip.get("id"));
         }
         else
         {
           status = "Error, Boiler can be added only to hotWaterPlant, steamPlant ";
           return status;
         }
       }
       else 
       {
         status = "Error, No Reference Equipment found with id - " +refEquip;
         return status;
       }
    }
    else
    {
      equip.add("equipRef", "Individual Equipment");
    }
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(boilersTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("boiler"))
    {  
       if(validEquip.has("hotWater") && validEquip.has("steam"))
       {
         adOp.recs.remove(dis);
         status = "Error, A boiler can have either 'hotWater' or 'steam' tag ";
         return status;
       }
       else if(validEquip.has("gas") && validEquip.has("oil"))
       {
         adOp.recs.remove(dis);
         status = "Error, A boiler can have either 'gas' or 'oil' tag ";
         return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Boiler should have a 'equip, and boiler' tag";
    return status;
  }

  /**
  * This method creates a hot Water Plant with Haystack tag taxonomy
  * @param site is reference to a valid site for adding hot water plant
  * @param dis is the Id of hot Water Plant
  * @param markers are tags to be assigned
  * @return - returns the status of operation
  */

  public String addHotWaterPlant(HDict site, String dis, String markers) throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef",  site.get("id"));
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(hotWaterPlantTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("hotWaterPlant") && validEquip.has("super"))
    {
       if(validEquip.has("primaryLoop") && validEquip.has("secondaryLoop"))
       {
          adOp.recs.remove(dis);
          status = "Error, A Hot Water Plant can only be either  - primaryLoop, secondaryLoop ";
          return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Hot Water Plant should have a 'equip, HotWaterPlant, and super' tag";
    return status;
  }

  /**
  * This method creates a steam Plant with Haystack tag taxonomy
  * @param site is reference to a valid site for adding steam plant
  * @param dis is the Id of steam Plant
  * @param markers are tags to be assigned
  * @return - returns the status of operation
  */

  public String addSteamPlant(HDict site, String dis, String markers) throws NullPointerException
  {
    BMPV2HaystackServer adOp = BMPV2HaystackServer.bmpInstance();
    String status = "";
    String suid = UUID.randomUUID().toString();
    HDictBuilder equip = new HDictBuilder()
      .add("id",      HRef.make(suid))
      .add("dis",     dis)
      .add("siteRef",  site.get("id"));
    StringTokenizer st = new StringTokenizer(markers);
    while (st.hasMoreTokens())
    {
       String tag = st.nextToken().toString();
       if(steamPlantTags.contains(tag))
       {
         equip.add(tag);
       }
       else
       {
         status = "Error, Invalid Tag '" +tag+ "' ";
         return status;  
       }
    } 
    adOp.recs.put(dis,equip.toDict());
    HDict validEquip = (HDict)adOp.recs.get(dis);
    if(validEquip.has("equip") && validEquip.has("steamPlant") && validEquip.has("super"))
    {
       if(validEquip.has("primaryLoop") && validEquip.has("secondaryLoop"))
       {
          adOp.recs.remove(dis);
          status = "Error, A Steam Plant can only be either  - primaryLoop, secondaryLoop ";
          return status;
       }
       status = "Success, Equip id " +(((HDict)adOp.recs.get(dis)).id().toCode());
       return status;  
    }
    adOp.recs.remove(dis);
    status = "Error, A Steam Plant should have a 'equip, steamPlant, and super' tag";
    return status;
  }

//////////////////////////////////////////////////////////////////////////
// Fields
//////////////////////////////////////////////////////////////////////////

  private static ArrayList<String> chillerTags = new ArrayList<String>();
  private static ArrayList<String> chilledWaterPlantTags = new ArrayList<String>();
  private static ArrayList<String> ahuTags  = new ArrayList<String>(); 
  private static ArrayList<String> coolingTowerTags  = new ArrayList<String>(); 
  private static ArrayList<String> heatExchangersTags  = new ArrayList<String>(); 
  private static ArrayList<String> meterTags = new ArrayList<String>();
  private static ArrayList<String> boilersTags = new ArrayList<String>();
  private static ArrayList<String> hotWaterPlantTags = new ArrayList<String>();
  private static ArrayList<String> steamPlantTags = new ArrayList<String>();
  private static ArrayList<String> storageTanksTags = new ArrayList<String>();

//////////////////////////////////////////////////////////////////////////
// Functions to add valid tags
//////////////////////////////////////////////////////////////////////////
  
  /*
  * This function is used to add valid tags to ArrayList ahuTags
  */
  private static void validAhuTags()
  {
    ahuTags.add("ahu");
    ahuTags.add("equip");
    ahuTags.add("hvac");
    ahuTags.add("rooftop");
    ahuTags.add("mau");
    ahuTags.add("elecHeat");
    ahuTags.add("hotWaterHeat");
    ahuTags.add("steamHeat");
    ahuTags.add("gasHeat");
    ahuTags.add("chilledWaterCool");
    ahuTags.add("dxCool");
    ahuTags.add("constantVolume");
    ahuTags.add("variableVolume");
    ahuTags.add("directZone");
    ahuTags.add("vavZone");
    ahuTags.add("chilledBeamZone");
    ahuTags.add("multiZone");
    ahuTags.add("singleDuct");
    ahuTags.add("dualDuct");
    ahuTags.add("tripleDuct");
  }
  /*
  * This function is used to add valid tags to ArrayList chillerTags
  */
  private static void validChillerTags()
  {
    chillerTags.add("chiller");
    chillerTags.add("equip");
    chillerTags.add("waterCooled");
    chillerTags.add("airCooled");
    chillerTags.add("absorption");
    chillerTags.add("reciprocal");
    chillerTags.add("screw");
    chillerTags.add("centrifugal");
  }
  /*
  * This function is used to add valid tags to ArrayList chilledWaterPlantTags
  */
  private static void validChilledWaterPlantTags()
  {
    chilledWaterPlantTags.add("chilledWaterPlant");
    chilledWaterPlantTags.add("equip");
    chilledWaterPlantTags.add("primaryLoop");
    chilledWaterPlantTags.add("secondaryLoop");
    chilledWaterPlantTags.add("super");
  }
  /*
  * This function is used to add valid tags to ArrayList coolingTowerTags
  */
  private static void validCoolingTowerTags()
  {
    coolingTowerTags.add("coolingTower");
    coolingTowerTags.add("equip");
    coolingTowerTags.add("openLoop");
    coolingTowerTags.add("closedLoop");
  }
  /*
  * This function is used to add valid tags to ArrayList heatExchangerTags
  */
  private static void validHeatExchangersTags()
  {
    heatExchangersTags.add("heatExchanger");
    heatExchangersTags.add("equip");
  }
  /*
  * This function is used to add valid tags to ArrayList meterTags
  */
  private static void validMeterTags()
  {
    meterTags.add("meter");
    meterTags.add("equip");
    meterTags.add("elecMeter");
    meterTags.add("gasMeter");
    meterTags.add("domesticWaterMeter");
    meterTags.add("chilledWaterMeter");
    meterTags.add("condenserWaterMeter");
    meterTags.add("hotWaterMeter");
    meterTags.add("makeupWaterMeter");
    meterTags.add("blowdownWaterMeter");
    meterTags.add("condensateWaterMeter");
    meterTags.add("steamMeter");
    meterTags.add("siteMeter");
  }
  /*
  * This function is used to add valid tags t ArrayList boiler tags
  */
  private static void validBoilersTags()
  {
    boilersTags.add("boiler");
    boilersTags.add("equip"); 
    boilersTags.add("hotWater");
    boilersTags.add("steam"); 
    boilersTags.add("oil");
    boilersTags.add("gas");  
  }
  /*
  * This function is used to add valid tags to ArrayList hotWaterPlantTags
  */
  private static void validHotWaterPlantTags()
  {
    hotWaterPlantTags.add("hotWaterPlant");
    hotWaterPlantTags.add("equip");
    hotWaterPlantTags.add("primaryLoop");
    hotWaterPlantTags.add("secondaryLoop");
    hotWaterPlantTags.add("super");
  }
  /*
  * This function is used to add valid tags to ArrayList steamPlantTags
  */
  private static void validSteamPlantTags()
  {
    steamPlantTags.add("steamPlant");
    steamPlantTags.add("equip");
    steamPlantTags.add("primaryLoop");
    steamPlantTags.add("secondaryLoop");
    steamPlantTags.add("super");
  }
  /*
  * This function is used to add valid tags to ArrayList storageTanksTags
  */
  private static void validStorageTanksTags()
  {
    storageTanksTags.add("equip");
    storageTanksTags.add("tank");
    storageTanksTags.add("hotWater");
    storageTanksTags.add("domesticWater");
    storageTanksTags.add("condensateWater");
    storageTanksTags.add("gas");
    storageTanksTags.add("oil");  
  }
}

