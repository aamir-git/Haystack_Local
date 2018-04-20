/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.auth;

import java.net.HttpURLConnection;
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
public class AuthSchemeTest {
    
    public AuthSchemeTest() {
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
     * Test of find method, of class AuthScheme.
     */
    @org.junit.Test
    public void testFind_String() {
        System.out.println("find");
        String name = "";
        AuthScheme expResult = null;
        AuthScheme result = AuthScheme.find(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AuthScheme.
     */
    @org.junit.Test
    public void testFind_String_boolean() {
        System.out.println("find");
        String name = "";
        boolean checked = false;
        AuthScheme expResult = null;
        AuthScheme result = AuthScheme.find(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class AuthScheme.
     */
    @org.junit.Test
    public void testList() {
        System.out.println("list");
        AuthScheme[] expResult = null;
        AuthScheme[] result = AuthScheme.list();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClient method, of class AuthScheme.
     */
    @org.junit.Test
    public void testOnClient() {
        System.out.println("onClient");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        AuthScheme instance = null;
        AuthMsg expResult = null;
        AuthMsg result = instance.onClient(cx, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClientSuccess method, of class AuthScheme.
     */
    @org.junit.Test
    public void testOnClientSuccess() {
        System.out.println("onClientSuccess");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        AuthScheme instance = null;
        instance.onClientSuccess(cx, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClientNonStd method, of class AuthScheme.
     */
    @org.junit.Test
    public void testOnClientNonStd() {
        System.out.println("onClientNonStd");
        AuthClientContext cx = null;
        HttpURLConnection resp = null;
        String content = "";
        AuthScheme instance = null;
        boolean expResult = false;
        boolean result = instance.onClientNonStd(cx, resp, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AuthSchemeImpl extends AuthScheme {

        public AuthSchemeImpl() {
            super("");
        }

        public AuthMsg onClient(AuthClientContext cx, AuthMsg msg) {
            return null;
        }
    }

    public class AuthSchemeImpl extends AuthScheme {

        public AuthSchemeImpl() {
            super("");
        }

        public AuthMsg onClient(AuthClientContext cx, AuthMsg msg) {
            return null;
        }
    }

    public class AuthSchemeImpl extends AuthScheme {

        public AuthSchemeImpl() {
            super("");
        }

        public AuthMsg onClient(AuthClientContext cx, AuthMsg msg) {
            return null;
        }
    }
    
}
