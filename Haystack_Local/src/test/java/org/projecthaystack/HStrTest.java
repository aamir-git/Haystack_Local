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
public class HStrTest {
    
    public HStrTest() {
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
     * Test of make method, of class HStr.
     */
    @org.junit.Test
    public void testMake() {
        System.out.println("make");
        String val = "";
        HStr expResult = null;
        HStr result = HStr.make(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HStr.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HStr instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HStr.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HStr instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HStr.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HStr instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HStr.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HStr instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HStr.
     */
    @org.junit.Test
    public void testToZinc_0args() {
        System.out.println("toZinc");
        HStr instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toCode method, of class HStr.
     */
    @org.junit.Test
    public void testToCode() {
        System.out.println("toCode");
        String val = "";
        String expResult = "";
        String result = HStr.toCode(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HStr.
     */
    @org.junit.Test
    public void testToZinc_StringBuffer_String() {
        System.out.println("toZinc");
        StringBuffer s = null;
        String val = "";
        HStr.toZinc(s, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of split method, of class HStr.
     */
    @org.junit.Test
    public void testSplit() {
        System.out.println("split");
        String str = "";
        int separator = 0;
        boolean trim = false;
        String[] expResult = null;
        String[] result = HStr.split(str, separator, trim);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
