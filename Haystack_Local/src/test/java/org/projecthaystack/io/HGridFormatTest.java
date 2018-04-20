/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.io;

import java.io.InputStream;
import java.io.OutputStream;
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
public class HGridFormatTest {
    
    public HGridFormatTest() {
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
     * Test of find method, of class HGridFormat.
     */
    @org.junit.Test
    public void testFind() {
        System.out.println("find");
        String mime = "";
        boolean checked = false;
        HGridFormat expResult = null;
        HGridFormat result = HGridFormat.find(mime, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of list method, of class HGridFormat.
     */
    @org.junit.Test
    public void testList() {
        System.out.println("list");
        HGridFormat[] expResult = null;
        HGridFormat[] result = HGridFormat.list();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class HGridFormat.
     */
    @org.junit.Test
    public void testRegister() {
        System.out.println("register");
        HGridFormat format = null;
        HGridFormat.register(format);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeReader method, of class HGridFormat.
     */
    @org.junit.Test
    public void testMakeReader() {
        System.out.println("makeReader");
        InputStream in = null;
        HGridFormat instance = null;
        HGridReader expResult = null;
        HGridReader result = instance.makeReader(in);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeWriter method, of class HGridFormat.
     */
    @org.junit.Test
    public void testMakeWriter() {
        System.out.println("makeWriter");
        OutputStream out = null;
        HGridFormat instance = null;
        HGridWriter expResult = null;
        HGridWriter result = instance.makeWriter(out);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
