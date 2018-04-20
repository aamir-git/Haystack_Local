/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.io.PrintWriter;
import java.util.Iterator;
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
public class HGridTest {
    
    public HGridTest() {
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
     * Test of meta method, of class HGrid.
     */
    @org.junit.Test
    public void testMeta() {
        System.out.println("meta");
        HGrid instance = null;
        HDict expResult = null;
        HDict result = instance.meta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isErr method, of class HGrid.
     */
    @org.junit.Test
    public void testIsErr() {
        System.out.println("isErr");
        HGrid instance = null;
        boolean expResult = false;
        boolean result = instance.isErr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class HGrid.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        HGrid instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numRows method, of class HGrid.
     */
    @org.junit.Test
    public void testNumRows() {
        System.out.println("numRows");
        HGrid instance = null;
        int expResult = 0;
        int result = instance.numRows();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of row method, of class HGrid.
     */
    @org.junit.Test
    public void testRow() {
        System.out.println("row");
        int row = 0;
        HGrid instance = null;
        HRow expResult = null;
        HRow result = instance.row(row);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numCols method, of class HGrid.
     */
    @org.junit.Test
    public void testNumCols() {
        System.out.println("numCols");
        HGrid instance = null;
        int expResult = 0;
        int result = instance.numCols();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of col method, of class HGrid.
     */
    @org.junit.Test
    public void testCol_int() {
        System.out.println("col");
        int index = 0;
        HGrid instance = null;
        HCol expResult = null;
        HCol result = instance.col(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of col method, of class HGrid.
     */
    @org.junit.Test
    public void testCol_String() {
        System.out.println("col");
        String name = "";
        HGrid instance = null;
        HCol expResult = null;
        HCol result = instance.col(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of col method, of class HGrid.
     */
    @org.junit.Test
    public void testCol_String_boolean() {
        System.out.println("col");
        String name = "";
        boolean checked = false;
        HGrid instance = null;
        HCol expResult = null;
        HCol result = instance.col(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class HGrid.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        HGrid instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HGrid.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HGrid instance = null;
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HGrid.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HGrid instance = null;
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HGrid.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        HGrid instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HGrid.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HGrid instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dump method, of class HGrid.
     */
    @org.junit.Test
    public void testDump_0args() {
        System.out.println("dump");
        HGrid instance = null;
        instance.dump();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dump method, of class HGrid.
     */
    @org.junit.Test
    public void testDump_PrintWriter() {
        System.out.println("dump");
        PrintWriter out = null;
        HGrid instance = null;
        instance.dump(out);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
