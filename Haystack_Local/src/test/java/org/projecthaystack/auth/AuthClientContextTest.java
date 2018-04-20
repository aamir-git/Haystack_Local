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
public class AuthClientContextTest {
    
    public AuthClientContextTest() {
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
     * Test of isAuthenticated method, of class AuthClientContext.
     */
    @org.junit.Test
    public void testIsAuthenticated() {
        System.out.println("isAuthenticated");
        AuthClientContext instance = null;
        boolean expResult = false;
        boolean result = instance.isAuthenticated();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class AuthClientContext.
     */
    @org.junit.Test
    public void testOpen() {
        System.out.println("open");
        AuthClientContext instance = null;
        AuthClientContext expResult = null;
        AuthClientContext result = instance.open();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openHttpConnection method, of class AuthClientContext.
     */
    @org.junit.Test
    public void testOpenHttpConnection() throws Exception {
        System.out.println("openHttpConnection");
        String uri = "";
        String method = "";
        AuthClientContext instance = null;
        HttpURLConnection expResult = null;
        HttpURLConnection result = instance.openHttpConnection(uri, method);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCookiesToHeaders method, of class AuthClientContext.
     */
    @org.junit.Test
    public void testAddCookiesToHeaders() {
        System.out.println("addCookiesToHeaders");
        HttpURLConnection c = null;
        AuthClientContext instance = null;
        instance.addCookiesToHeaders(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepare method, of class AuthClientContext.
     */
    @org.junit.Test
    public void testPrepare() {
        System.out.println("prepare");
        HttpURLConnection c = null;
        AuthClientContext instance = null;
        HttpURLConnection expResult = null;
        HttpURLConnection result = instance.prepare(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
