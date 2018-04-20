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
public class CryptoUtilTest {
    
    public CryptoUtilTest() {
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
     * Test of hmac method, of class CryptoUtil.
     */
    @org.junit.Test
    public void testHmac() throws Exception {
        System.out.println("hmac");
        String algorithm = "";
        byte[] data = null;
        byte[] key = null;
        byte[] expResult = null;
        byte[] result = CryptoUtil.hmac(algorithm, data, key);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of digest method, of class CryptoUtil.
     */
    @org.junit.Test
    public void testDigest() throws Exception {
        System.out.println("digest");
        String algorithm = "";
        byte[] data = null;
        byte[] expResult = null;
        byte[] result = CryptoUtil.digest(algorithm, data);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pbk method, of class CryptoUtil.
     */
    @org.junit.Test
    public void testPbk() throws Exception {
        System.out.println("pbk");
        String algorithm = "";
        byte[] password = null;
        byte[] salt = null;
        int iterationCount = 0;
        int derivedKeyLength = 0;
        byte[] expResult = null;
        byte[] result = CryptoUtil.pbk(algorithm, password, salt, iterationCount, derivedKeyLength);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
