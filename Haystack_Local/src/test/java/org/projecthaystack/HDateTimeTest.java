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
public class HDateTimeTest {
    
    public HDateTimeTest() {
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
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_4args() {
        System.out.println("make");
        HDate date = null;
        HTime time = null;
        HTimeZone tz = null;
        int tzOffset = 0;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(date, time, tz, tzOffset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_3args() {
        System.out.println("make");
        HDate date = null;
        HTime time = null;
        HTimeZone tz = null;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(date, time, tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_8args() {
        System.out.println("make");
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        int sec = 0;
        HTimeZone tz = null;
        int tzOffset = 0;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(year, month, day, hour, min, sec, tz, tzOffset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_7args() {
        System.out.println("make");
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;
        HTimeZone tz = null;
        int tzOffset = 0;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(year, month, day, hour, min, tz, tzOffset);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_long() {
        System.out.println("make");
        long millis = 0L;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(millis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_long_HTimeZone() {
        System.out.println("make");
        long millis = 0L;
        HTimeZone tz = null;
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(millis, tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTime.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String s = "";
        HDateTime expResult = null;
        HDateTime result = HDateTime.make(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of now method, of class HDateTime.
     */
    @org.junit.Test
    public void testNow_0args() {
        System.out.println("now");
        HDateTime expResult = null;
        HDateTime result = HDateTime.now();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of now method, of class HDateTime.
     */
    @org.junit.Test
    public void testNow_HTimeZone() {
        System.out.println("now");
        HTimeZone tz = null;
        HDateTime expResult = null;
        HDateTime result = HDateTime.now(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of millis method, of class HDateTime.
     */
    @org.junit.Test
    public void testMillis() {
        System.out.println("millis");
        HDateTime instance = null;
        long expResult = 0L;
        long result = instance.millis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HDateTime.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HDateTime instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HDateTime.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HDateTime instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class HDateTime.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object that = null;
        HDateTime instance = null;
        int expResult = 0;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HDateTime.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HDateTime instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HDateTime.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HDateTime instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
