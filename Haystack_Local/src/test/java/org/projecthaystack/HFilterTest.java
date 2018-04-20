/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

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
public class HFilterTest {
    
    public HFilterTest() {
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
     * Test of make method, of class HFilter.
     */
    @org.junit.Test
    public void testMake_String() {
        System.out.println("make");
        String s = "";
        HFilter expResult = null;
        HFilter result = HFilter.make(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of make method, of class HFilter.
     */
    @org.junit.Test
    public void testMake_String_boolean() {
        System.out.println("make");
        String s = "";
        boolean checked = false;
        HFilter expResult = null;
        HFilter result = HFilter.make(s, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of has method, of class HFilter.
     */
    @org.junit.Test
    public void testHas() {
        System.out.println("has");
        String path = "";
        HFilter expResult = null;
        HFilter result = HFilter.has(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of missing method, of class HFilter.
     */
    @org.junit.Test
    public void testMissing() {
        System.out.println("missing");
        String path = "";
        HFilter expResult = null;
        HFilter result = HFilter.missing(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eq method, of class HFilter.
     */
    @org.junit.Test
    public void testEq() {
        System.out.println("eq");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.eq(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ne method, of class HFilter.
     */
    @org.junit.Test
    public void testNe() {
        System.out.println("ne");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.ne(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lt method, of class HFilter.
     */
    @org.junit.Test
    public void testLt() {
        System.out.println("lt");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.lt(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of le method, of class HFilter.
     */
    @org.junit.Test
    public void testLe() {
        System.out.println("le");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.le(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gt method, of class HFilter.
     */
    @org.junit.Test
    public void testGt() {
        System.out.println("gt");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.gt(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ge method, of class HFilter.
     */
    @org.junit.Test
    public void testGe() {
        System.out.println("ge");
        String path = "";
        HVal val = null;
        HFilter expResult = null;
        HFilter result = HFilter.ge(path, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of and method, of class HFilter.
     */
    @org.junit.Test
    public void testAnd() {
        System.out.println("and");
        HFilter that = null;
        HFilter instance = new HFilterImpl();
        HFilter expResult = null;
        HFilter result = instance.and(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of or method, of class HFilter.
     */
    @org.junit.Test
    public void testOr() {
        System.out.println("or");
        HFilter that = null;
        HFilter instance = new HFilterImpl();
        HFilter expResult = null;
        HFilter result = instance.or(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of include method, of class HFilter.
     */
    @org.junit.Test
    public void testInclude() {
        System.out.println("include");
        HDict dict = null;
        HFilter.Pather pather = null;
        HFilter instance = new HFilterImpl();
        boolean expResult = false;
        boolean result = instance.include(dict, pather);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HFilter.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HFilter instance = new HFilterImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStr method, of class HFilter.
     */
    @org.junit.Test
    public void testToStr() {
        System.out.println("toStr");
        HFilter instance = new HFilterImpl();
        String expResult = "";
        String result = instance.toStr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HFilter.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HFilter instance = new HFilterImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HFilter.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HFilter instance = new HFilterImpl();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HFilterImpl extends HFilter {

        public boolean include(HDict dict, Pather pather) {
            return false;
        }

        public String toStr() {
            return "";
        }
    }

    public class HFilterImpl extends HFilter {

        public boolean include(HDict dict, Pather pather) {
            return false;
        }

        public String toStr() {
            return "";
        }
    }
    
}
