/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.projecthaystack.HDict;

/**
 *
 * @author aamirkhx
 */
public class BMPV2ServerTest {
    
    public BMPV2ServerTest() {
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
     * Test of addSite method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testAddSite() {
        System.out.println("addSite");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.addSite(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEquip method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testAddEquip() {
        System.out.println("addEquip");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.addEquip(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPoint method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testAddPoint() {
        System.out.println("addPoint");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.addPoint(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddSite method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testOnAddSite() {
        System.out.println("onAddSite");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.onAddSite(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddEquip method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testOnAddEquip() {
        System.out.println("onAddEquip");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.onAddEquip(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddPoint method, of class BMPV2Server.
     */
    @org.junit.Test
    public void testOnAddPoint() {
        System.out.println("onAddPoint");
        String status = "";
        BMPV2Server instance = new BMPV2ServerImpl();
        HDict expResult = null;
        HDict result = instance.onAddPoint(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BMPV2ServerImpl extends BMPV2Server {

        public HDict onAddSite(String status) {
            return null;
        }

        public HDict onAddEquip(String status) {
            return null;
        }

        public HDict onAddPoint(String status) {
            return null;
        }
    }

    public class BMPV2ServerImpl extends BMPV2Server {

        public HDict onAddSite(String status) {
            return null;
        }

        public HDict onAddEquip(String status) {
            return null;
        }

        public HDict onAddPoint(String status) {
            return null;
        }
    }

    public class BMPV2ServerImpl extends BMPV2Server {

        public HDict onAddSite(String status) {
            return null;
        }

        public HDict onAddEquip(String status) {
            return null;
        }

        public HDict onAddPoint(String status) {
            return null;
        }
    }
    
}
