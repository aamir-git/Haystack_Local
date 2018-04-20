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
public class HCoordTest {
    
    public HCoordTest() {
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
     * Test of make method, of class HCoord.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String s = "";
        HCoord expResult = null;
        HCoord result = HCoord.make(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HCoord.
     */
    @org.junit.Test
    public void testMake_double_double() {
        System.out.println("make");
        double lat = 0.0;
        double lng = 0.0;
        HCoord expResult = null;
        HCoord result = HCoord.make(lat, lng);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLat method, of class HCoord.
     */
    @org.junit.Test
    public void testIsLat() {
        System.out.println("isLat");
        double lat = 0.0;
        boolean expResult = false;
        boolean result = HCoord.isLat(lat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLng method, of class HCoord.
     */
    @org.junit.Test
    public void testIsLng() {
        System.out.println("isLng");
        double lng = 0.0;
        boolean expResult = false;
        boolean result = HCoord.isLng(lng);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lat method, of class HCoord.
     */
    @org.junit.Test
    public void testLat() {
        System.out.println("lat");
        HCoord instance = null;
        double expResult = 0.0;
        double result = instance.lat();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lng method, of class HCoord.
     */
    @org.junit.Test
    public void testLng() {
        System.out.println("lng");
        HCoord instance = null;
        double expResult = 0.0;
        double result = instance.lng();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HCoord.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HCoord instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HCoord.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HCoord instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HCoord.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HCoord instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HCoord.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HCoord instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
