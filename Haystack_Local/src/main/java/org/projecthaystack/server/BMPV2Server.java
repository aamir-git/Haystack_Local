/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/
package org.projecthaystack.server;

import java.util.*;
import org.projecthaystack.*;

/**
 * BMPV2Server is the interface between HServlet and a database of
 * tag based entities.  All methods on BMPV2Server must be thread safe.
 * 
 * It extends HServer to add additional abstract operation for 
 * BMPV2HaystackServer to implement.   
 */


public abstract class BMPV2Server extends HServer
{

  /**
   * Get the addSite metadata 
   */
  public final HDict addSite(String status)
  {
     return new HDictBuilder()
     .add(onAddSite(status))
     .toDict();
  }

   /**
   * Get the addEquip metadata 
   */
  public final HDict addEquip(String status)
  {
     return new HDictBuilder()
      .add(onAddEquip(status))
      .toDict();
  }
   /**
   * Get the addPoint metadata 
   */
  public final HDict addPoint(String status)
  {
     return new HDictBuilder()
      .add(onAddPoint(status))
      .toDict();
  }

  /**Implementation Hook for AddSite*/
  protected abstract HDict onAddSite(String status);
  /**Implementaion Hook for AddAhu*/
  protected abstract HDict onAddEquip(String status);
  /**Implementation Hook for AddPoint*/
  protected abstract HDict onAddPoint(String status);

}
