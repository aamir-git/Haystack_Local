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
public class HValTest {
    
    public HValTest() {
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
     * Test of toString method, of class HVal.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        HVal instance = new HValImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toZinc method, of class HVal.
     */
    @org.junit.Test
    public void testToZinc() {
        System.out.println("toZinc");
        HVal instance = new HValImpl();
        String expResult = "";
        String result = instance.toZinc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class HVal.
     */
    @org.junit.Test
    public void testToJson() {
        System.out.println("toJson");
        HVal instance = new HValImpl();
        String expResult = "";
        String result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class HVal.
     */
    @org.junit.Test
    public void testHashCode() {
        System.out.println("hashCode");
        HVal instance = new HValImpl();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class HVal.
     */
    @org.junit.Test
    public void testEquals() {
        System.out.println("equals");
        Object that = null;
        HVal instance = new HValImpl();
        boolean expResult = false;
        boolean result = instance.equals(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class HVal.
     */
    @org.junit.Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object that = null;
        HVal instance = new HValImpl();
        int expResult = 0;
        int result = instance.compareTo(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HValImpl extends HVal {

        public String toZinc() {
            return "";
        }

        public String toJson() {
            return "";
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object that) {
            return false;
        }
    }

    public class HValImpl extends HVal {

        public String toZinc() {
            return "";
        }

        public String toJson() {
            return "";
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object that) {
            return false;
        }
    }

    public class HValImpl extends HVal {

        public String toZinc() {
            return "";
        }

        public String toJson() {
            return "";
        }

        public int hashCode() {
            return 0;
        }

        public boolean equals(Object that) {
            return false;
        }
    }
    
}
