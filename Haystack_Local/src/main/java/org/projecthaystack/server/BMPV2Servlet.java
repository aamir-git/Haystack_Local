/* INTEL CONFIDENTIAL

Copyright 2017-2018 Intel Corporation All Rights Reserved.

The source code contained or described herein and all documents related to the source code ("Material") are owned by Intel Corporation or its suppliers or licensors. Title to the Material remains with Intel Corporation or its suppliers and licensors. The Material contains trade secrets and proprietary and confidential information of Intel or its suppliers and licensors. The Material is protected by worldwide copyright and

trade secret laws and treaty provisions. No part of the Material may be used, copied, reproduced, modified, published, uploaded, posted, transmitted, distributed, or disclosed in any way without Intel's prior express written permission.

No license under any patent, copyright, trade secret or other intellectual property right is granted to or conferred upon you by disclosure or delivery of the Materials, either expressly, by implication, inducement, estoppel or otherwise. Any license under such intellectual property rights must be express and approved by Intel in writing.

*/
package org.projecthaystack.server;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * BMPV2Servlet implements the haystack HTTP REST API for
 * querying entities and history data.
 *
 */
@WebServlet("/*")
public class BMPV2Servlet extends HttpServlet
{

//////////////////////////////////////////////////////////////////////////
// Database Hook
//////////////////////////////////////////////////////////////////////////

  /**
   * Returns the instance of BMPV2HaystackServer
   */
  public BMPV2Server db()
  {
    return BMPV2HaystackServer.bmpInstance();
  }

//////////////////////////////////////////////////////////////////////////
// HttpServlet Hooks
//////////////////////////////////////////////////////////////////////////

  public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
    onService("GET", req, res);
  }

  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
    onService("POST", req, res);
  }

//////////////////////////////////////////////////////////////////////////
// Service
//////////////////////////////////////////////////////////////////////////
   /**
   * This function is used to service the URL
   */
  private void onService(String method, HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
    // get the database
    BMPV2Server db = db();
   
    // if root, then redirect to {haystack}/about
    String path = req.getPathInfo();
    if (path == null || path.length() == 0 || path.equals("/"))
    {
      res.sendRedirect(req.getContextPath() + "/about");
      return;
    }

    // parse URI path into "/{opName}/...."
    int slash = path.indexOf('/', 1);
    if (slash < 0) slash = path.length();
    String opName = path.substring(1, slash);

    // resolve the op
    HOp op = db.op(opName, false);
    if (op == null)
    {
      res.sendError(HttpServletResponse.SC_NOT_FOUND);
      return;
    }

    // route to the op
    try
    {
      op.onService(db, req, res);
    }
    catch (Exception e)
    {
      e.printStackTrace();
      throw new ServletException(e);
    }
  }

//////////////////////////////////////////////////////////////////////////
// Debug
//////////////////////////////////////////////////////////////////////////

  void dumpReq(HttpServletRequest req) { dumpReq(req, null); }
  void dumpReq(HttpServletRequest req, PrintWriter out)
  {
    try
    {
      if (out == null) out = new PrintWriter(System.out);
      out.println("==========================================");
      out.println("method      = " + req.getMethod());
      out.println("pathInfo    = " + req.getPathInfo());
      out.println("contextPath = " + req.getContextPath());
      out.println("servletPath = " + req.getServletPath());
      out.println("query       = " + (req.getQueryString() == null ? "null" : URLDecoder.decode(req.getQueryString(), "UTF-8")));
      out.println("headers:");
      Enumeration e = req.getHeaderNames();
      while (e.hasMoreElements())
      {
        String key = (String)e.nextElement();
        String val = req.getHeader(key);
        out.println("  " + key + " = " + val);
      }
      out.flush();
    }
    catch (Exception e) { e.printStackTrace(); }
  }

}
