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
public class WebUtilTest {
    
    public WebUtilTest() {
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
     * Test of isToken method, of class WebUtil.
     */
    @org.junit.Test
    public void testIsToken() {
        System.out.println("isToken");
        String s = "";
        boolean expResult = false;
        boolean result = WebUtil.isToken(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTokenChar method, of class WebUtil.
     */
    @org.junit.Test
    public void testIsTokenChar() {
        System.out.println("isTokenChar");
        int codePoint = 0;
        boolean expResult = false;
        boolean result = WebUtil.isTokenChar(codePoint);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
