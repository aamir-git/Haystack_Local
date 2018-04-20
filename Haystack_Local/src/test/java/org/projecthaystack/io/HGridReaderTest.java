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
import org.projecthaystack.HGrid;

/**
 *
 * @author aamirkhx
 */
public class HGridReaderTest {
    
    public HGridReaderTest() {
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
     * Test of readGrid method, of class HGridReader.
     */
    @org.junit.Test
    public void testReadGrid() {
        System.out.println("readGrid");
        HGridReader instance = new HGridReaderImpl();
        HGrid expResult = null;
        HGrid result = instance.readGrid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HGridReaderImpl extends HGridReader {

        public HGrid readGrid() {
            return null;
        }
    }

    public class HGridReaderImpl extends HGridReader {

        public HGrid readGrid() {
            return null;
        }
    }

    public class HGridReaderImpl extends HGridReader {

        public HGrid readGrid() {
            return null;
        }
    }
    
}
