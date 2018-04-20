/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.util.Iterator;
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
public class HHisItemTest {
    
    public HHisItemTest() {
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
     * Test of gridToItems method, of class HHisItem.
     */
    @org.junit.Test
    public void testGridToItems() {
        System.out.println("gridToItems");
        HGrid grid = null;
        HHisItem[] expResult = null;
        HHisItem[] result = HHisItem.gridToItems(grid);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HHisItem.
     */
    @org.junit.Test
    public void testMake() {
        System.out.println("make");
        HDateTime ts = null;
        HVal val = null;
        HHisItem expResult = null;
        HHisItem result = HHisItem.make(ts, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class HHisItem.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        HHisItem instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HHisItem.
     */
    @org.junit.Test
    public void testGet() {
        System.out.println("get");
        String name = "";
        boolean checked = false;
        HHisItem instance = null;
        HVal expResult = null;
        HVal result = instance.get(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class HHisItem.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        HHisItem instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
