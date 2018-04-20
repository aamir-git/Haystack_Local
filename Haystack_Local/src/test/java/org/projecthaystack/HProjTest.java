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
public class HProjTest {
    
    public HProjTest() {
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
     * Test of about method, of class HProj.
     */
    @org.junit.Test
    public void testAbout() {
        System.out.println("about");
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.about();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readById method, of class HProj.
     */
    @org.junit.Test
    public void testReadById_HRef() {
        System.out.println("readById");
        HRef id = null;
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.readById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readById method, of class HProj.
     */
    @org.junit.Test
    public void testReadById_HRef_boolean() {
        System.out.println("readById");
        HRef id = null;
        boolean checked = false;
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.readById(id, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readByIds method, of class HProj.
     */
    @org.junit.Test
    public void testReadByIds_HRefArr() {
        System.out.println("readByIds");
        HRef[] ids = null;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.readByIds(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readByIds method, of class HProj.
     */
    @org.junit.Test
    public void testReadByIds_HRefArr_boolean() {
        System.out.println("readByIds");
        HRef[] ids = null;
        boolean checked = false;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.readByIds(ids, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadById method, of class HProj.
     */
    @org.junit.Test
    public void testOnReadById() {
        System.out.println("onReadById");
        HRef id = null;
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.onReadById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadByIds method, of class HProj.
     */
    @org.junit.Test
    public void testOnReadByIds() {
        System.out.println("onReadByIds");
        HRef[] ids = null;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.onReadByIds(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class HProj.
     */
    @org.junit.Test
    public void testRead_String() {
        System.out.println("read");
        String filter = "";
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.read(filter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class HProj.
     */
    @org.junit.Test
    public void testRead_String_boolean() {
        System.out.println("read");
        String filter = "";
        boolean checked = false;
        HProj instance = new HProjImpl();
        HDict expResult = null;
        HDict result = instance.read(filter, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class HProj.
     */
    @org.junit.Test
    public void testReadAll_String() {
        System.out.println("readAll");
        String filter = "";
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.readAll(filter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class HProj.
     */
    @org.junit.Test
    public void testReadAll_String_int() {
        System.out.println("readAll");
        String filter = "";
        int limit = 0;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.readAll(filter, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadAll method, of class HProj.
     */
    @org.junit.Test
    public void testOnReadAll() {
        System.out.println("onReadAll");
        String filter = "";
        int limit = 0;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.onReadAll(filter, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchOpen method, of class HProj.
     */
    @org.junit.Test
    public void testWatchOpen() {
        System.out.println("watchOpen");
        String dis = "";
        HNum lease = null;
        HProj instance = new HProjImpl();
        HWatch expResult = null;
        HWatch result = instance.watchOpen(dis, lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watches method, of class HProj.
     */
    @org.junit.Test
    public void testWatches() {
        System.out.println("watches");
        HProj instance = new HProjImpl();
        HWatch[] expResult = null;
        HWatch[] result = instance.watches();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watch method, of class HProj.
     */
    @org.junit.Test
    public void testWatch_String() {
        System.out.println("watch");
        String id = "";
        HProj instance = new HProjImpl();
        HWatch expResult = null;
        HWatch result = instance.watch(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watch method, of class HProj.
     */
    @org.junit.Test
    public void testWatch_String_boolean() {
        System.out.println("watch");
        String id = "";
        boolean checked = false;
        HProj instance = new HProjImpl();
        HWatch expResult = null;
        HWatch result = instance.watch(id, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisRead method, of class HProj.
     */
    @org.junit.Test
    public void testHisRead() {
        System.out.println("hisRead");
        HRef id = null;
        Object range = null;
        HProj instance = new HProjImpl();
        HGrid expResult = null;
        HGrid result = instance.hisRead(id, range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisWrite method, of class HProj.
     */
    @org.junit.Test
    public void testHisWrite() {
        System.out.println("hisWrite");
        HRef id = null;
        HHisItem[] items = null;
        HProj instance = new HProjImpl();
        instance.hisWrite(id, items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HProjImpl extends HProj {

        public HDict about() {
            return null;
        }

        public HDict onReadById(HRef id) {
            return null;
        }

        public HGrid onReadByIds(HRef[] ids) {
            return null;
        }

        public HGrid onReadAll(String filter, int limit) {
            return null;
        }

        public HWatch watchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] watches() {
            return null;
        }

        public HWatch watch(String id, boolean checked) {
            return null;
        }

        public HGrid hisRead(HRef id, Object range) {
            return null;
        }

        public void hisWrite(HRef id, HHisItem[] items) {
        }
    }

    public class HProjImpl extends HProj {

        public HDict about() {
            return null;
        }

        public HDict onReadById(HRef id) {
            return null;
        }

        public HGrid onReadByIds(HRef[] ids) {
            return null;
        }

        public HGrid onReadAll(String filter, int limit) {
            return null;
        }

        public HWatch watchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] watches() {
            return null;
        }

        public HWatch watch(String id, boolean checked) {
            return null;
        }

        public HGrid hisRead(HRef id, Object range) {
            return null;
        }

        public void hisWrite(HRef id, HHisItem[] items) {
        }
    }

    public class HProjImpl extends HProj {

        public HDict about() {
            return null;
        }

        public HDict onReadById(HRef id) {
            return null;
        }

        public HGrid onReadByIds(HRef[] ids) {
            return null;
        }

        public HGrid onReadAll(String filter, int limit) {
            return null;
        }

        public HWatch watchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] watches() {
            return null;
        }

        public HWatch watch(String id, boolean checked) {
            return null;
        }

        public HGrid hisRead(HRef id, Object range) {
            return null;
        }

        public void hisWrite(HRef id, HHisItem[] items) {
        }
    }
    
}
