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
public class BasicSchemeTest {
    
    public BasicSchemeTest() {
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
     * Test of onClient method, of class BasicScheme.
     */
    @org.junit.Test
    public void testOnClient() {
        System.out.println("onClient");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        BasicScheme instance = new BasicScheme();
        AuthMsg expResult = null;
        AuthMsg result = instance.onClient(cx, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClientNonStd method, of class BasicScheme.
     */
    @org.junit.Test
    public void testOnClientNonStd() {
        System.out.println("onClientNonStd");
        AuthClientContext cx = null;
        HttpURLConnection resp = null;
        String content = "";
        BasicScheme instance = new BasicScheme();
        boolean expResult = false;
        boolean result = instance.onClientNonStd(cx, resp, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of use method, of class BasicScheme.
     */
    @org.junit.Test
    public void testUse() {
        System.out.println("use");
        HttpURLConnection c = null;
        String content = "";
        boolean expResult = false;
        boolean result = BasicScheme.use(c, content);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
