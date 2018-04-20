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
public class HDateTimeRangeTest {
    
    public HDateTimeRangeTest() {
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
     * Test of make method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testMake_String_HTimeZone() {
        System.out.println("make");
        String str = "";
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.make(str, tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testMake_HDate_HTimeZone() {
        System.out.println("make");
        HDate date = null;
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.make(date, tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testMake_3args() {
        System.out.println("make");
        HDate start = null;
        HDate end = null;
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.make(start, end, tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testMake_HDateTime_HDateTime() {
        System.out.println("make");
        HDateTime start = null;
        HDateTime end = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.make(start, end);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thisWeek method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testThisWeek() {
        System.out.println("thisWeek");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.thisWeek(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thisMonth method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testThisMonth() {
        System.out.println("thisMonth");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.thisMonth(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of thisYear method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testThisYear() {
        System.out.println("thisYear");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.thisYear(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastWeek method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testLastWeek() {
        System.out.println("lastWeek");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.lastWeek(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastMonth method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testLastMonth() {
        System.out.println("lastMonth");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.lastMonth(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lastYear method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testLastYear() {
        System.out.println("lastYear");
        HTimeZone tz = null;
        HDateTimeRange expResult = null;
        HDateTimeRange result = HDateTimeRange.lastYear(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HDateTimeRange.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HDateTimeRange instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
