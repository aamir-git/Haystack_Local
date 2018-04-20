/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.util.List;
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
public class HListTest {
    
    public HListTest() {
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
     * Test of make method, of class HList.
     */
    @org.junit.Test
    public void testMake_HValArr() {
        System.out.println("make");
        HVal[] items = null;
        HList expResult = null;
        HList result = HList.make(items);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HList.
     */
    @org.junit.Test
    public void testMake_List() {
        System.out.println("make");
        List items = null;
        HList expResult = null;
        HList result = HList.make(items);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class HList.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        HList instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HList.
     */
    @org.junit.Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        HList instance = null;
        HVal expResult = null;
        HVal result = instance.get(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HList.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HList instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HList.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HList instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HList.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        HList instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HList.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HList instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
