/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.util;

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
public class Base64Test {
    
    public Base64Test() {
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
     * Test of decodeUtf8 method, of class Base64.
     */
    @org.junit.Test
    public void testDecodeUtf8() {
        System.out.println("decodeUtf8");
        String str = "";
        byte[] expResult = null;
        byte[] result = Base64.decodeUtf8(str);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class Base64.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        String str = "";
        Base64 instance = null;
        String expResult = "";
        String result = instance.encode(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encodeUTF8 method, of class Base64.
     */
    @org.junit.Test
    public void testEncodeUTF8() {
        System.out.println("encodeUTF8");
        String str = "";
        Base64 instance = null;
        String expResult = "";
        String result = instance.encodeUTF8(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decode method, of class Base64.
     */
    @org.junit.Test
    public void testDecode() {
        System.out.println("decode");
        String str = "";
        Base64 instance = null;
        String expResult = "";
        String result = instance.decode(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decodeUTF8 method, of class Base64.
     */
    @org.junit.Test
    public void testDecodeUTF8() {
        System.out.println("decodeUTF8");
        String str = "";
        Base64 instance = null;
        String expResult = "";
        String result = instance.decodeUTF8(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encodeBytes method, of class Base64.
     */
    @org.junit.Test
    public void testEncodeBytes() {
        System.out.println("encodeBytes");
        byte[] buf = null;
        Base64 instance = null;
        String expResult = "";
        String result = instance.encodeBytes(buf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of decodeBytes method, of class Base64.
     */
    @org.junit.Test
    public void testDecodeBytes() {
        System.out.println("decodeBytes");
        String s = "";
        Base64 instance = null;
        byte[] expResult = null;
        byte[] result = instance.decodeBytes(s);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
