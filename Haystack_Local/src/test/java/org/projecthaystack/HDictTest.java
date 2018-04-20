/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import java.util.Iterator;
import java.util.Map;
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
public class HDictTest {
    
    public HDictTest() {
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
     * Test of isEmpty method, of class HDict.
     */
    @org.junit.Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        HDict instance = new HDictImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class HDict.
     */
    @org.junit.Test
    public void testSize() {
        System.out.println("size");
        HDict instance = new HDictImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of has method, of class HDict.
     */
    @org.junit.Test
    public void testHas() {
        System.out.println("has");
        String name = "";
        HDict instance = new HDictImpl();
        boolean expResult = false;
        boolean result = instance.has(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of missing method, of class HDict.
     */
    @org.junit.Test
    public void testMissing() {
        System.out.println("missing");
        String name = "";
        HDict instance = new HDictImpl();
        boolean expResult = false;
        boolean result = instance.missing(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HDict.
     */
    @org.junit.Test
    public void testGet_String() {
        System.out.println("get");
        String name = "";
        HDict instance = new HDictImpl();
        HVal expResult = null;
        HVal result = instance.get(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class HDict.
     */
    @org.junit.Test
    public void testGet_String_boolean() {
        System.out.println("get");
        String name = "";
        boolean checked = false;
        HDict instance = new HDictImpl();
        HVal expResult = null;
        HVal result = instance.get(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class HDict.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        HDict instance = new HDictImpl();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of id method, of class HDict.
     */
    @org.junit.Test
    public void testId() {
        System.out.println("id");
        HDict instance = new HDictImpl();
        HRef expResult = null;
        HRef result = instance.id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dis method, of class HDict.
     */
    @org.junit.Test
    public void testDis() {
        System.out.println("dis");
        HDict instance = new HDictImpl();
        String expResult = "";
        String result = instance.dis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBool method, of class HDict.
     */
    @org.junit.Test
    public void testGetBool() {
        System.out.println("getBool");
        String name = "";
        HDict instance = new HDictImpl();
        boolean expResult = false;
        boolean result = instance.getBool(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStr method, of class HDict.
     */
    @org.junit.Test
    public void testGetStr() {
        System.out.println("getStr");
        String name = "";
        HDict instance = new HDictImpl();
        String expResult = "";
        String result = instance.getStr(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRef method, of class HDict.
     */
    @org.junit.Test
    public void testGetRef() {
        System.out.println("getRef");
        String name = "";
        HDict instance = new HDictImpl();
        HRef expResult = null;
        HRef result = instance.getRef(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInt method, of class HDict.
     */
    @org.junit.Test
    public void testGetInt() {
        System.out.println("getInt");
        String name = "";
        HDict instance = new HDictImpl();
        int expResult = 0;
        int result = instance.getInt(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDouble method, of class HDict.
     */
    @org.junit.Test
    public void testGetDouble() {
        System.out.println("getDouble");
        String name = "";
        HDict instance = new HDictImpl();
        double expResult = 0.0;
        double result = instance.getDouble(name);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class HDict.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HDict instance = new HDictImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HDict.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HDict instance = new HDictImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HDict.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HDict instance = new HDictImpl();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTagName method, of class HDict.
     */
    @org.junit.Test
    public void testIsTagName() {
        System.out.println("isTagName");
        String n = "";
        boolean expResult = false;
        boolean result = HDict.isTagName(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HDict.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HDict instance = new HDictImpl();
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HDict.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HDict instance = new HDictImpl();
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toEntry method, of class HDict.
     */
    @org.junit.Test
    public void testToEntry() {
        System.out.println("toEntry");
        String key = "";
        HVal val = null;
        Map.Entry expResult = null;
        Map.Entry result = HDict.toEntry(key, val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HDictImpl extends HDict {

        public int size() {
            return 0;
        }

        public HVal get(String name, boolean checked) {
            return null;
        }

        public Iterator iterator() {
            return null;
        }
    }

    public class HDictImpl extends HDict {

        public int size() {
            return 0;
        }

        public HVal get(String name, boolean checked) {
            return null;
        }

        public Iterator iterator() {
            return null;
        }
    }

    public class HDictImpl extends HDict {

        public int size() {
            return 0;
        }

        public HVal get(String name, boolean checked) {
            return null;
        }

        public Iterator iterator() {
            return null;
        }
    }
    
}
