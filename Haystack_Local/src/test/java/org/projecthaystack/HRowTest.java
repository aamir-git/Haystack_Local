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
public class HRowTest {
    
    public HRowTest() {
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
     * Test of grid method, of class HRow.
     */
    @org.junit.Test
    public void testGrid() {
        System.out.println("grid");
        HRow instance = null;
        HGrid expResult = null;
        HGrid result = instance.grid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class HRow.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        HRow instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HRow.
     */
    @org.junit.Test
    public void testGet_String_boolean() {
        System.out.println("get");
        String name = "";
        boolean checked = false;
        HRow instance = null;
        HVal expResult = null;
        HVal result = instance.get(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HRow.
     */
    @org.junit.Test
    public void testGet_HCol_boolean() {
        System.out.println("get");
        HCol col = null;
        boolean checked = false;
        HRow instance = null;
        HVal expResult = null;
        HVal result = instance.get(col, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class HRow.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        HRow instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
