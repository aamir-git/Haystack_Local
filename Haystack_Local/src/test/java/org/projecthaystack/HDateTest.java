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
public class HDateTest {
    
    public HDateTest() {
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
     * Test of make method, of class HDate.
     */
    @org.junit.Test
    public void testMake_3args() {
        System.out.println("make");
        int year = 0;
        int month = 0;
        int day = 0;
        HDate expResult = null;
        HDate result = HDate.make(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDate.
     */
    @org.junit.Test
    public void testMake_Calendar() {
        System.out.println("make");
        Calendar c = null;
        HDate expResult = null;
        HDate result = HDate.make(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HDate.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String s = "";
        HDate expResult = null;
        HDate result = HDate.make(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of today method, of class HDate.
     */
    @org.junit.Test
    public void testToday() {
        System.out.println("today");
        HDate expResult = null;
        HDate result = HDate.today();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HDate.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HDate instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HDate.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HDate instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class HDate.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object that = null;
        HDate instance = null;
        int expResult = 0;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HDate.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HDate instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HDate.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HDate instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class HDate.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        StringBuffer s = null;
        HDate instance = null;
        instance.encode(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of midnight method, of class HDate.
     */
    @org.junit.Test
    public void testMidnight() {
        System.out.println("midnight");
        HTimeZone tz = null;
        HDate instance = null;
        HDateTime expResult = null;
        HDateTime result = instance.midnight(tz);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusDays method, of class HDate.
     */
    @org.junit.Test
    public void testPlusDays() {
        System.out.println("plusDays");
        int numDays = 0;
        HDate instance = null;
        HDate expResult = null;
        HDate result = instance.plusDays(numDays);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minusDays method, of class HDate.
     */
    @org.junit.Test
    public void testMinusDays() {
        System.out.println("minusDays");
        int numDays = 0;
        HDate instance = null;
        HDate expResult = null;
        HDate result = instance.minusDays(numDays);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLeapYear method, of class HDate.
     */
    @org.junit.Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        int year = 0;
        boolean expResult = false;
        boolean result = HDate.isLeapYear(year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of daysInMonth method, of class HDate.
     */
    @org.junit.Test
    public void testDaysInMonth() {
        System.out.println("daysInMonth");
        int year = 0;
        int mon = 0;
        int expResult = 0;
        int result = HDate.daysInMonth(year, mon);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of weekday method, of class HDate.
     */
    @org.junit.Test
    public void testWeekday() {
        System.out.println("weekday");
        HDate instance = null;
        int expResult = 0;
        int result = instance.weekday();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
