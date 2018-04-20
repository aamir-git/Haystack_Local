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
public class HXStrTest {
    
    public HXStrTest() {
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
     * Test of decode method, of class HXStr.
     */
    @org.junit.Test
    public void testDecode() {
        System.out.println("decode");
        String type = "";
        String val = "";
        HVal expResult = null;
        HVal result = HXStr.decode(type, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class HXStr.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        Object val = null;
        HXStr expResult = null;
        HXStr result = HXStr.encode(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HXStr.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HXStr instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HXStr.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HXStr instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HXStr.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        HXStr instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HXStr.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HXStr instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
