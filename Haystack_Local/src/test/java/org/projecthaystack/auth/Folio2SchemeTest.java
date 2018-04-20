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
public class Folio2SchemeTest {
    
    public Folio2SchemeTest() {
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
     * Test of onClient method, of class Folio2Scheme.
     */
    @org.junit.Test
    public void testOnClient() {
        System.out.println("onClient");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        Folio2Scheme instance = new Folio2Scheme();
        AuthMsg expResult = null;
        AuthMsg result = instance.onClient(cx, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClientNonStd method, of class Folio2Scheme.
     */
    @org.junit.Test
    public void testOnClientNonStd() {
        System.out.println("onClientNonStd");
        AuthClientContext cx = null;
        HttpURLConnection resp = null;
        String content = "";
        Folio2Scheme instance = new Folio2Scheme();
        boolean expResult = false;
        boolean result = instance.onClientNonStd(cx, resp, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
