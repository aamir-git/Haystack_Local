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
public class HGridWriterTest {
    
    public HGridWriterTest() {
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
     * Test of writeGrid method, of class HGridWriter.
     */
    @org.junit.Test
    public void testWriteGrid() {
        System.out.println("writeGrid");
        HGrid grid = null;
        HGridWriter instance = new HGridWriterImpl();
        instance.writeGrid(grid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of flush method, of class HGridWriter.
     */
    @org.junit.Test
    public void testFlush() {
        System.out.println("flush");
        HGridWriter instance = new HGridWriterImpl();
        instance.flush();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class HGridWriter.
     */
    @org.junit.Test
    public void testClose() {
        System.out.println("close");
        HGridWriter instance = new HGridWriterImpl();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HGridWriterImpl extends HGridWriter {

        public void writeGrid(HGrid grid) {
        }

        public void flush() {
        }

        public void close() {
        }
    }

    public class HGridWriterImpl extends HGridWriter {

        public void writeGrid(HGrid grid) {
        }

        public void flush() {
        }

        public void close() {
        }
    }

    public class HGridWriterImpl extends HGridWriter {

        public void writeGrid(HGrid grid) {
        }

        public void flush() {
        }

        public void close() {
        }
    }
    
}
