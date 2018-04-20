/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.io;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.projecthaystack.HDict;
import org.projecthaystack.HGrid;
import org.projecthaystack.HVal;

/**
 *
 * @author aamirkhx
 */
public class HZincReaderTest {
    
    public HZincReaderTest() {
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
     * Test of close method, of class HZincReader.
     */
    @org.junit.Test
    public void testClose() {
        System.out.println("close");
        HZincReader instance = null;
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readVal method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadVal_0args() {
        System.out.println("readVal");
        HZincReader instance = null;
        HVal expResult = null;
        HVal result = instance.readVal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readVal method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadVal_boolean() {
        System.out.println("readVal");
        boolean close = false;
        HZincReader instance = null;
        HVal expResult = null;
        HVal result = instance.readVal(close);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readGrid method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadGrid() {
        System.out.println("readGrid");
        HZincReader instance = null;
        HGrid expResult = null;
        HGrid result = instance.readGrid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readGrids method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadGrids() {
        System.out.println("readGrids");
        HZincReader instance = null;
        HGrid[] expResult = null;
        HGrid[] result = instance.readGrids();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readDict method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadDict() {
        System.out.println("readDict");
        HZincReader instance = null;
        HDict expResult = null;
        HDict result = instance.readDict();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readScalar method, of class HZincReader.
     */
    @org.junit.Test
    public void testReadScalar() {
        System.out.println("readScalar");
        HZincReader instance = null;
        HVal expResult = null;
        HVal result = instance.readScalar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
