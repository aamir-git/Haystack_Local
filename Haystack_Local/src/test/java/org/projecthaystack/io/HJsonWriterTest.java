/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.io;

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
public class HJsonWriterTest {
    
    public HJsonWriterTest() {
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
     * Test of gridToString method, of class HJsonWriter.
     */
    @org.junit.Test
    public void testGridToString() {
        System.out.println("gridToString");
        HGrid grid = null;
        String expResult = "";
        String result = HJsonWriter.gridToString(grid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeGrid method, of class HJsonWriter.
     */
    @org.junit.Test
    public void testWriteGrid() {
        System.out.println("writeGrid");
        HGrid grid = null;
        HJsonWriter instance = null;
        instance.writeGrid(grid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class HJsonWriter.
     */
    @org.junit.Test
    public void testFlush() {
        System.out.println("flush");
        HJsonWriter instance = null;
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class HJsonWriter.
     */
    @org.junit.Test
    public void testClose() {
        System.out.println("close");
        HJsonWriter instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
