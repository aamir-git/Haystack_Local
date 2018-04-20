/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

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
public class HGridBuilderTest {
    
    public HGridBuilderTest() {
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
     * Test of dictToGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testDictToGrid() {
        System.out.println("dictToGrid");
        HDict dict = null;
        HGrid expResult = null;
        HGrid result = HGridBuilder.dictToGrid(dict);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dictsToGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testDictsToGrid_HDictArr() {
        System.out.println("dictsToGrid");
        HDict[] dicts = null;
        HGrid expResult = null;
        HGrid result = HGridBuilder.dictsToGrid(dicts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dictsToGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testDictsToGrid_HDict_HDictArr() {
        System.out.println("dictsToGrid");
        HDict meta = null;
        HDict[] dicts = null;
        HGrid expResult = null;
        HGrid result = HGridBuilder.dictsToGrid(meta, dicts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of errToGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testErrToGrid() {
        System.out.println("errToGrid");
        Throwable e = null;
        HGrid expResult = null;
        HGrid result = HGridBuilder.errToGrid(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisItemsToGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testHisItemsToGrid() {
        System.out.println("hisItemsToGrid");
        HDict meta = null;
        HHisItem[] items = null;
        HGrid expResult = null;
        HGrid result = HGridBuilder.hisItemsToGrid(meta, items);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of meta method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testMeta() {
        System.out.println("meta");
        HGridBuilder instance = new HGridBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.meta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCol method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testAddCol() {
        System.out.println("addCol");
        String name = "";
        HGridBuilder instance = new HGridBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.addCol(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRow method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testAddRow() {
        System.out.println("addRow");
        HVal[] cells = null;
        HGridBuilder instance = new HGridBuilder();
        HGridBuilder expResult = null;
        HGridBuilder result = instance.addRow(cells);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toGrid method, of class HGridBuilder.
     */
    @org.junit.Test
    public void testToGrid() {
        System.out.println("toGrid");
        HGridBuilder instance = new HGridBuilder();
        HGrid expResult = null;
        HGrid result = instance.toGrid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
