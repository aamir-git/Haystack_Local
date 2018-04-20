/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.util.TimeZone;
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
public class HTimeZoneTest {
    
    public HTimeZoneTest() {
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
     * Test of make method, of class HTimeZone.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String name = "";
        HTimeZone expResult = null;
        HTimeZone result = HTimeZone.make(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTimeZone.
     */
    @org.junit.Test
    public void testMake_String_boolean() {
        System.out.println("make");
        String name = "";
        boolean checked = false;
        HTimeZone expResult = null;
        HTimeZone result = HTimeZone.make(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTimeZone.
     */
    @org.junit.Test
    public void testMake_TimeZone() {
        System.out.println("make");
        TimeZone java = null;
        HTimeZone expResult = null;
        HTimeZone result = HTimeZone.make(java);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HTimeZone.
     */
    @org.junit.Test
    public void testMake_TimeZone_boolean() {
        System.out.println("make");
        TimeZone java = null;
        boolean checked = false;
        HTimeZone expResult = null;
        HTimeZone result = HTimeZone.make(java, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HTimeZone.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HTimeZone instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
