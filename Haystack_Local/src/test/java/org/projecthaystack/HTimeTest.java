/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.util.Calendar;
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
public class HTimeTest {
    
    public HTimeTest() {
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
     * Test of make method, of class HTime.
     */
    @org.junit.Test
    public void testMake_4args() {
        System.out.println("make");
        int hour = 0;
        int min = 0;
        int sec = 0;
        int ms = 0;
        HTime expResult = null;
        HTime result = HTime.make(hour, min, sec, ms);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTime.
     */
    @org.junit.Test
    public void testMake_3args() {
        System.out.println("make");
        int hour = 0;
        int min = 0;
        int sec = 0;
        HTime expResult = null;
        HTime result = HTime.make(hour, min, sec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTime.
     */
    @org.junit.Test
    public void testMake_int_int() {
        System.out.println("make");
        int hour = 0;
        int min = 0;
        HTime expResult = null;
        HTime result = HTime.make(hour, min);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTime.
     */
    @org.junit.Test
    public void testMake_Calendar() {
        System.out.println("make");
        Calendar c = null;
        HTime expResult = null;
        HTime result = HTime.make(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTime.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String s = "";
        HTime expResult = null;
        HTime result = HTime.make(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HTime.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HTime instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HTime.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HTime instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class HTime.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object that = null;
        HTime instance = null;
        int expResult = 0;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HTime.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HTime instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HTime.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HTime instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class HTime.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        StringBuffer s = null;
        HTime instance = null;
        instance.encode(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
