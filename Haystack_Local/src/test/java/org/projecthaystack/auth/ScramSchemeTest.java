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
public class ScramSchemeTest {
    
    public ScramSchemeTest() {
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
     * Test of onClient method, of class ScramScheme.
     */
    @org.junit.Test
    public void testOnClient() {
        System.out.println("onClient");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        ScramScheme instance = new ScramScheme();
        AuthMsg expResult = null;
        AuthMsg result = instance.onClient(cx, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onClientSuccess method, of class ScramScheme.
     */
    @org.junit.Test
    public void testOnClientSuccess() {
        System.out.println("onClientSuccess");
        AuthClientContext cx = null;
        AuthMsg msg = null;
        ScramScheme instance = new ScramScheme();
        instance.onClientSuccess(cx, msg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
