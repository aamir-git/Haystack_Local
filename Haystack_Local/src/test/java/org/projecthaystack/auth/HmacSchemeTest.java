/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.auth;

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
public class HmacSchemeTest {
    
    public HmacSchemeTest() {
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
     * Test of onClient method, of class HmacScheme.
     */
    @org.junit.Test
    public void testOnClient() {
        System.out.println("onClient");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        HmacScheme instance = new HmacScheme();
        AuthMsg expResult = null;
        AuthMsg result = instance.onClient(cx, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hmac method, of class HmacScheme.
     */
    @org.junit.Test
    public void testHmac() throws Exception {
        System.out.println("hmac");
        String user = "";
        String pass = "";
        String salt = "";
        String hash = "";
        String expResult = "";
        String result = HmacScheme.hmac(user, pass, salt, hash);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
