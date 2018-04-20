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
import org.projecthaystack.HGrid;
import org.projecthaystack.HRef;
import org.projecthaystack.HVal;

/**
 *
 * @author aamirkhx
 */
public class HOpTest {
    
    public HOpTest() {
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
     * Test of name method, of class HOp.
     */
    @org.junit.Test
    public void testName() {
        System.out.println("name");
        HOp instance = new HOpImpl();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summary method, of class HOp.
     */
    @org.junit.Test
    public void testSummary() {
        System.out.println("summary");
        HOp instance = new HOpImpl();
        String expResult = "";
        String result = instance.summary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onService method, of class HOp.
     */
    @org.junit.Test
    public void testOnService_3args() {
        System.out.println("onService");
        BMPV2Server db = null;
        HttpServletRequest req = null;
        HttpServletResponse res = null;
        HOp instance = new HOpImpl();
        instance.onService(db, req, res);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onService method, of class HOp.
     */
    @org.junit.Test
    public void testOnService_BMPV2Server_HGrid() throws Exception {
        System.out.println("onService");
        BMPV2Server db = null;
        HGrid req = null;
        HOp instance = new HOpImpl();
        HGrid expResult = null;
        HGrid result = instance.onService(db, req);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gridToIds method, of class HOp.
     */
    @org.junit.Test
    public void testGridToIds() {
        System.out.println("gridToIds");
        BMPV2Server db = null;
        HGrid grid = null;
        HOp instance = new HOpImpl();
        HRef[] expResult = null;
        HRef[] result = instance.gridToIds(db, grid);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of valToId method, of class HOp.
     */
    @org.junit.Test
    public void testValToId() {
        System.out.println("valToId");
        BMPV2Server db = null;
        HVal val = null;
        HOp instance = new HOpImpl();
        HRef expResult = null;
        HRef result = instance.valToId(db, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HOpImpl extends HOp {

        public String name() {
            return "";
        }

        public String summary() {
            return "";
        }
    }

    public class HOpImpl extends HOp {

        public String name() {
            return "";
        }

        public String summary() {
            return "";
        }
    }

    public class HOpImpl extends HOp {

        public String name() {
            return "";
        }

        public String summary() {
            return "";
        }
    }
    
}
