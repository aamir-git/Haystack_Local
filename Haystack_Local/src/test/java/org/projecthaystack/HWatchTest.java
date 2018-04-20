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
public class HWatchTest {
    
    public HWatchTest() {
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
     * Test of id method, of class HWatch.
     */
    @org.junit.Test
    public void testId() {
        System.out.println("id");
        HWatch instance = new HWatchImpl();
        String expResult = "";
        String result = instance.id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dis method, of class HWatch.
     */
    @org.junit.Test
    public void testDis() {
        System.out.println("dis");
        HWatch instance = new HWatchImpl();
        String expResult = "";
        String result = instance.dis();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lease method, of class HWatch.
     */
    @org.junit.Test
    public void testLease() {
        System.out.println("lease");
        HWatch instance = new HWatchImpl();
        HNum expResult = null;
        HNum result = instance.lease();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class HWatch.
     */
    @org.junit.Test
    public void testSub_HRefArr() {
        System.out.println("sub");
        HRef[] ids = null;
        HWatch instance = new HWatchImpl();
        HGrid expResult = null;
        HGrid result = instance.sub(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class HWatch.
     */
    @org.junit.Test
    public void testSub_HRefArr_boolean() {
        System.out.println("sub");
        HRef[] ids = null;
        boolean checked = false;
        HWatch instance = new HWatchImpl();
        HGrid expResult = null;
        HGrid result = instance.sub(ids, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of unsub method, of class HWatch.
     */
    @org.junit.Test
    public void testUnsub() {
        System.out.println("unsub");
        HRef[] ids = null;
        HWatch instance = new HWatchImpl();
        instance.unsub(ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollChanges method, of class HWatch.
     */
    @org.junit.Test
    public void testPollChanges() {
        System.out.println("pollChanges");
        HWatch instance = new HWatchImpl();
        HGrid expResult = null;
        HGrid result = instance.pollChanges();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pollRefresh method, of class HWatch.
     */
    @org.junit.Test
    public void testPollRefresh() {
        System.out.println("pollRefresh");
        HWatch instance = new HWatchImpl();
        HGrid expResult = null;
        HGrid result = instance.pollRefresh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class HWatch.
     */
    @org.junit.Test
    public void testClose() {
        System.out.println("close");
        HWatch instance = new HWatchImpl();
        instance.close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOpen method, of class HWatch.
     */
    @org.junit.Test
    public void testIsOpen() {
        System.out.println("isOpen");
        HWatch instance = new HWatchImpl();
        boolean expResult = false;
        boolean result = instance.isOpen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HWatchImpl extends HWatch {

        public String id() {
            return "";
        }

        public String dis() {
            return "";
        }

        public HNum lease() {
            return null;
        }

        public HGrid sub(HRef[] ids, boolean checked) {
            return null;
        }

        public void unsub(HRef[] ids) {
        }

        public HGrid pollChanges() {
            return null;
        }

        public HGrid pollRefresh() {
            return null;
        }

        public void close() {
        }

        public boolean isOpen() {
            return false;
        }
    }

    public class HWatchImpl extends HWatch {

        public String id() {
            return "";
        }

        public String dis() {
            return "";
        }

        public HNum lease() {
            return null;
        }

        public HGrid sub(HRef[] ids, boolean checked) {
            return null;
        }

        public void unsub(HRef[] ids) {
        }

        public HGrid pollChanges() {
            return null;
        }

        public HGrid pollRefresh() {
            return null;
        }

        public void close() {
        }

        public boolean isOpen() {
            return false;
        }
    }

    public class HWatchImpl extends HWatch {

        public String id() {
            return "";
        }

        public String dis() {
            return "";
        }

        public HNum lease() {
            return null;
        }

        public HGrid sub(HRef[] ids, boolean checked) {
            return null;
        }

        public void unsub(HRef[] ids) {
        }

        public HGrid pollChanges() {
            return null;
        }

        public HGrid pollRefresh() {
            return null;
        }

        public void close() {
        }

        public boolean isOpen() {
            return false;
        }
    }
    
}
