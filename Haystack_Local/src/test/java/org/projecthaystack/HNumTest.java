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
public class HNumTest {
    
    public HNumTest() {
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
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_int() {
        System.out.println("make");
        int val = 0;
        HNum expResult = null;
        HNum result = HNum.make(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_int_String() {
        System.out.println("make");
        int val = 0;
        String unit = "";
        HNum expResult = null;
        HNum result = HNum.make(val, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_long() {
        System.out.println("make");
        long val = 0L;
        HNum expResult = null;
        HNum result = HNum.make(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_long_String() {
        System.out.println("make");
        long val = 0L;
        String unit = "";
        HNum expResult = null;
        HNum result = HNum.make(val, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_double() {
        System.out.println("make");
        double val = 0.0;
        HNum expResult = null;
        HNum result = HNum.make(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HNum.
     */
    @org.junit.Test
    public void testMake_double_String() {
        System.out.println("make");
        double val = 0.0;
        String unit = "";
        HNum expResult = null;
        HNum result = HNum.make(val, unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HNum.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HNum instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HNum.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HNum instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class HNum.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object that = null;
        HNum instance = null;
        int expResult = 0;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HNum.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HNum instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HNum.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HNum instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of millis method, of class HNum.
     */
    @org.junit.Test
    public void testMillis() {
        System.out.println("millis");
        HNum instance = null;
        long expResult = 0L;
        long result = instance.millis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUnitName method, of class HNum.
     */
    @org.junit.Test
    public void testIsUnitName() {
        System.out.println("isUnitName");
        String unit = "";
        boolean expResult = false;
        boolean result = HNum.isUnitName(unit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
