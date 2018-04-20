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
public class HRefTest {
    
    public HRefTest() {
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
     * Test of make method, of class HRef.
     */
    @org.junit.Test
    public void testMake_String_String() {
        System.out.println("make");
        String val = "";
        String dis = "";
        HRef expResult = null;
        HRef result = HRef.make(val, dis);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HRef.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String val = "";
        HRef expResult = null;
        HRef result = HRef.make(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HRef.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HRef instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HRef.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HRef instance = null;
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dis method, of class HRef.
     */
    @org.junit.Test
    public void testDis() {
        System.out.println("dis");
        HRef instance = null;
        String expResult = "";
        String result = instance.dis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HRef.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HRef instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toCode method, of class HRef.
     */
    @org.junit.Test
    public void testToCode() {
        System.out.println("toCode");
        HRef instance = null;
        String expResult = "";
        String result = instance.toCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HRef.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HRef instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HRef.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HRef instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isId method, of class HRef.
     */
    @org.junit.Test
    public void testIsId() {
        System.out.println("isId");
        String id = "";
        boolean expResult = false;
        boolean result = HRef.isId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIdChar method, of class HRef.
     */
    @org.junit.Test
    public void testIsIdChar() {
        System.out.println("isIdChar");
        int ch = 0;
        boolean expResult = false;
        boolean result = HRef.isIdChar(ch);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
