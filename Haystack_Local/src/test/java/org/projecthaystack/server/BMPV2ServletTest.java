/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.server;

import java.io.PrintWriter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aamirkhx
 */
public class BMPV2ServletTest {
    
    public BMPV2ServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of db method, of class BMPV2Servlet.
     */
    @org.junit.Test
    public void testDb() {
        System.out.println("db");
        BMPV2Servlet instance = new BMPV2Servlet();
        BMPV2Server expResult = null;
        BMPV2Server result = instance.db();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class BMPV2Servlet.
     */
    @org.junit.Test
    public void testDoGet() {
        System.out.println("doGet");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        BMPV2Servlet instance = new BMPV2Servlet();
        instance.doGet(req, res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class BMPV2Servlet.
     */
    @org.junit.Test
    public void testDoPost() {
        System.out.println("doPost");
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        BMPV2Servlet instance = new BMPV2Servlet();
        instance.doPost(req, res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dumpReq method, of class BMPV2Servlet.
     */
    @org.junit.Test
    public void testDumpReq_ErrorType() {
        System.out.println("dumpReq");
        HttpServletRequest req = null;
        BMPV2Servlet instance = new BMPV2Servlet();
        instance.dumpReq(req);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dumpReq method, of class BMPV2Servlet.
     */
    @org.junit.Test
    public void testDumpReq_ErrorType_PrintWriter() {
        System.out.println("dumpReq");
        HttpServletRequest req = null;
        PrintWriter out = null;
        BMPV2Servlet instance = new BMPV2Servlet();
        instance.dumpReq(req, out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
