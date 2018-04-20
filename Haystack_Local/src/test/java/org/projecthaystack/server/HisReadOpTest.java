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

/**
 *
 * @author aamirkhx
 */
public class HisReadOpTest {
    
    public HisReadOpTest() {
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
     * Test of name method, of class HisReadOp.
     */
    @org.junit.Test
    public void testName() {
        System.out.println("name");
        HisReadOp instance = new HisReadOp();
        String expResult = "";
        String result = instance.name();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of summary method, of class HisReadOp.
     */
    @org.junit.Test
    public void testSummary() {
        System.out.println("summary");
        HisReadOp instance = new HisReadOp();
        String expResult = "";
        String result = instance.summary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onService method, of class HisReadOp.
     */
    @org.junit.Test
    public void testOnService() throws Exception {
        System.out.println("onService");
        BMPV2Server db = null;
        HGrid req = null;
        HisReadOp instance = new HisReadOp();
        HGrid expResult = null;
        HGrid result = instance.onService(db, req);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
