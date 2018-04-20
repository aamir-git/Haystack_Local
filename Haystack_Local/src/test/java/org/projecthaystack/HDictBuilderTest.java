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
public class HDictBuilderTest {
    
    public HDictBuilderTest() {
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
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String() {
        System.out.println("add");
        String name = "";
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String_boolean() {
        System.out.println("add");
        String name = "";
        boolean val = false;
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String_long() {
        System.out.println("add");
        String name = "";
        long val = 0L;
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_3args_1() {
        System.out.println("add");
        String name = "";
        long val = 0L;
        String unit = "";
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String_double() {
        System.out.println("add");
        String name = "";
        double val = 0.0;
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_3args_2() {
        System.out.println("add");
        String name = "";
        double val = 0.0;
        String unit = "";
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String_String() {
        System.out.println("add");
        String name = "";
        String val = "";
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_HDict() {
        System.out.println("add");
        HDict dict = null;
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(dict);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testAdd_String_HVal() {
        System.out.println("add");
        String name = "";
        HVal val = null;
        HDictBuilder instance = new HDictBuilder();
        HDictBuilder expResult = null;
        HDictBuilder result = instance.add(name, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toDict method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testToDict() {
        System.out.println("toDict");
        HDictBuilder instance = new HDictBuilder();
        HDict expResult = null;
        HDict result = instance.toDict();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        HDictBuilder instance = new HDictBuilder();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        HDictBuilder instance = new HDictBuilder();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of has method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testHas() {
        System.out.println("has");
        String name = "";
        HDictBuilder instance = new HDictBuilder();
        boolean expResult = false;
        boolean result = instance.has(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of missing method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testMissing() {
        System.out.println("missing");
        String name = "";
        HDictBuilder instance = new HDictBuilder();
        boolean expResult = false;
        boolean result = instance.missing(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testGet_String() {
        System.out.println("get");
        String name = "";
        HDictBuilder instance = new HDictBuilder();
        HVal expResult = null;
        HVal result = instance.get(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HDictBuilder.
     */
    @org.junit.Test
    public void testGet_String_boolean() {
        System.out.println("get");
        String name = "";
        boolean checked = false;
        HDictBuilder instance = new HDictBuilder();
        HVal expResult = null;
        HVal result = instance.get(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
