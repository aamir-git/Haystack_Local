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
public class HCsvWriterTest {
    
    public HCsvWriterTest() {
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
     * Test of writeGrid method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testWriteGrid() {
        System.out.println("writeGrid");
        HGrid grid = null;
        HCsvWriter instance = null;
        instance.writeGrid(grid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testFlush() {
        System.out.println("flush");
        HCsvWriter instance = null;
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testClose() {
        System.out.println("close");
        HCsvWriter instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeCell method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testWriteCell() {
        System.out.println("writeCell");
        String cell = "";
        HCsvWriter instance = null;
        instance.writeCell(cell);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isQuoteRequired method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testIsQuoteRequired() {
        System.out.println("isQuoteRequired");
        String cell = "";
        HCsvWriter instance = null;
        boolean expResult = false;
        boolean result = instance.isQuoteRequired(cell);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isWhiteSpace method, of class HCsvWriter.
     */
    @org.junit.Test
    public void testIsWhiteSpace() {
        System.out.println("isWhiteSpace");
        int c = 0;
        boolean expResult = false;
        boolean result = HCsvWriter.isWhiteSpace(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
