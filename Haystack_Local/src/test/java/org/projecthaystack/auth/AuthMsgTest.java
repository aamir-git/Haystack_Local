/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.auth;

import java.util.Map;
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
public class AuthMsgTest {
    
    public AuthMsgTest() {
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
     * Test of listFromStr method, of class AuthMsg.
     */
    @org.junit.Test
    public void testListFromStr() {
        System.out.println("listFromStr");
        String s = "";
        AuthMsg[] expResult = null;
        AuthMsg[] result = AuthMsg.listFromStr(s);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromStr method, of class AuthMsg.
     */
    @org.junit.Test
    public void testFromStr_String() {
        System.out.println("fromStr");
        String s = "";
        AuthMsg expResult = null;
        AuthMsg result = AuthMsg.fromStr(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromStr method, of class AuthMsg.
     */
    @org.junit.Test
    public void testFromStr_String_boolean() {
        System.out.println("fromStr");
        String s = "";
        boolean checked = false;
        AuthMsg expResult = null;
        AuthMsg result = AuthMsg.fromStr(s, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class AuthMsg.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        AuthMsg instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class AuthMsg.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        AuthMsg instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class AuthMsg.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        AuthMsg instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of param method, of class AuthMsg.
     */
    @org.junit.Test
    public void testParam_String() {
        System.out.println("param");
        String name = "";
        AuthMsg instance = null;
        String expResult = "";
        String result = instance.param(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of param method, of class AuthMsg.
     */
    @org.junit.Test
    public void testParam_String_boolean() {
        System.out.println("param");
        String name = "";
        boolean checked = false;
        AuthMsg instance = null;
        String expResult = "";
        String result = instance.param(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of splitList method, of class AuthMsg.
     */
    @org.junit.Test
    public void testSplitList() {
        System.out.println("splitList");
        String s = "";
        String[] expResult = null;
        String[] result = AuthMsg.splitList(s);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encode method, of class AuthMsg.
     */
    @org.junit.Test
    public void testEncode() {
        System.out.println("encode");
        String scheme = "";
        Map params = null;
        String expResult = "";
        String result = AuthMsg.encode(scheme, params);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
