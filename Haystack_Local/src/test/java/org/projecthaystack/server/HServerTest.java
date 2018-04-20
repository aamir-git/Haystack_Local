/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.server;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.projecthaystack.HDateTimeRange;
import org.projecthaystack.HDict;
import org.projecthaystack.HGrid;
import org.projecthaystack.HHisItem;
import org.projecthaystack.HNum;
import org.projecthaystack.HRef;
import org.projecthaystack.HUri;
import org.projecthaystack.HVal;
import org.projecthaystack.HWatch;

/**
 *
 * @author aamirkhx
 */
public class HServerTest {
    
    public HServerTest() {
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
     * Test of ops method, of class HServer.
     */
    @org.junit.Test
    public void testOps() {
        System.out.println("ops");
        HServer instance = new HServerImpl();
        HOp[] expResult = null;
        HOp[] result = instance.ops();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of op method, of class HServer.
     */
    @org.junit.Test
    public void testOp() {
        System.out.println("op");
        String name = "";
        boolean checked = false;
        HServer instance = new HServerImpl();
        HOp expResult = null;
        HOp result = instance.op(name, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of about method, of class HServer.
     */
    @org.junit.Test
    public void testAbout() {
        System.out.println("about");
        HServer instance = new HServerImpl();
        HDict expResult = null;
        HDict result = instance.about();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAbout method, of class HServer.
     */
    @org.junit.Test
    public void testOnAbout() {
        System.out.println("onAbout");
        HServer instance = new HServerImpl();
        HDict expResult = null;
        HDict result = instance.onAbout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadByIds method, of class HServer.
     */
    @org.junit.Test
    public void testOnReadByIds() {
        System.out.println("onReadByIds");
        HRef[] ids = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onReadByIds(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadAll method, of class HServer.
     */
    @org.junit.Test
    public void testOnReadAll() {
        System.out.println("onReadAll");
        String filter = "";
        int limit = 0;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onReadAll(filter, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class HServer.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        HServer instance = new HServerImpl();
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nav method, of class HServer.
     */
    @org.junit.Test
    public void testNav() {
        System.out.println("nav");
        String navId = "";
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.nav(navId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onNav method, of class HServer.
     */
    @org.junit.Test
    public void testOnNav() {
        System.out.println("onNav");
        String navId = "";
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onNav(navId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of navReadByUri method, of class HServer.
     */
    @org.junit.Test
    public void testNavReadByUri() {
        System.out.println("navReadByUri");
        HUri uri = null;
        boolean checked = false;
        HServer instance = new HServerImpl();
        HDict expResult = null;
        HDict result = instance.navReadByUri(uri, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onNavReadByUri method, of class HServer.
     */
    @org.junit.Test
    public void testOnNavReadByUri() {
        System.out.println("onNavReadByUri");
        HUri uri = null;
        HServer instance = new HServerImpl();
        HDict expResult = null;
        HDict result = instance.onNavReadByUri(uri);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchOpen method, of class HServer.
     */
    @org.junit.Test
    public void testWatchOpen() {
        System.out.println("watchOpen");
        String dis = "";
        HNum lease = null;
        HServer instance = new HServerImpl();
        HWatch expResult = null;
        HWatch result = instance.watchOpen(dis, lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watches method, of class HServer.
     */
    @org.junit.Test
    public void testWatches() {
        System.out.println("watches");
        HServer instance = new HServerImpl();
        HWatch[] expResult = null;
        HWatch[] result = instance.watches();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watch method, of class HServer.
     */
    @org.junit.Test
    public void testWatch() {
        System.out.println("watch");
        String id = "";
        boolean checked = false;
        HServer instance = new HServerImpl();
        HWatch expResult = null;
        HWatch result = instance.watch(id, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatchOpen method, of class HServer.
     */
    @org.junit.Test
    public void testOnWatchOpen() {
        System.out.println("onWatchOpen");
        String dis = "";
        HNum lease = null;
        HServer instance = new HServerImpl();
        HWatch expResult = null;
        HWatch result = instance.onWatchOpen(dis, lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatches method, of class HServer.
     */
    @org.junit.Test
    public void testOnWatches() {
        System.out.println("onWatches");
        HServer instance = new HServerImpl();
        HWatch[] expResult = null;
        HWatch[] result = instance.onWatches();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatch method, of class HServer.
     */
    @org.junit.Test
    public void testOnWatch() {
        System.out.println("onWatch");
        String id = "";
        HServer instance = new HServerImpl();
        HWatch expResult = null;
        HWatch result = instance.onWatch(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pointWriteArray method, of class HServer.
     */
    @org.junit.Test
    public void testPointWriteArray() {
        System.out.println("pointWriteArray");
        HRef id = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.pointWriteArray(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pointWrite method, of class HServer.
     */
    @org.junit.Test
    public void testPointWrite() {
        System.out.println("pointWrite");
        HRef id = null;
        int level = 0;
        HVal val = null;
        String who = "";
        HNum dur = null;
        HDict opts = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.pointWrite(id, level, val, who, dur, opts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onPointWriteArray method, of class HServer.
     */
    @org.junit.Test
    public void testOnPointWriteArray() {
        System.out.println("onPointWriteArray");
        HDict rec = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onPointWriteArray(rec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onPointWrite method, of class HServer.
     */
    @org.junit.Test
    public void testOnPointWrite() {
        System.out.println("onPointWrite");
        HDict rec = null;
        int level = 0;
        HVal val = null;
        String who = "";
        HNum dur = null;
        HDict opts = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onPointWrite(rec, level, val, who, dur, opts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisRead method, of class HServer.
     */
    @org.junit.Test
    public void testHisRead() {
        System.out.println("hisRead");
        HRef id = null;
        Object range = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.hisRead(id, range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onHisRead method, of class HServer.
     */
    @org.junit.Test
    public void testOnHisRead() {
        System.out.println("onHisRead");
        HDict rec = null;
        HDateTimeRange range = null;
        HServer instance = new HServerImpl();
        HHisItem[] expResult = null;
        HHisItem[] result = instance.onHisRead(rec, range);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisWrite method, of class HServer.
     */
    @org.junit.Test
    public void testHisWrite() {
        System.out.println("hisWrite");
        HRef id = null;
        HHisItem[] items = null;
        HServer instance = new HServerImpl();
        instance.hisWrite(id, items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onHisWrite method, of class HServer.
     */
    @org.junit.Test
    public void testOnHisWrite() {
        System.out.println("onHisWrite");
        HDict rec = null;
        HHisItem[] items = null;
        HServer instance = new HServerImpl();
        instance.onHisWrite(rec, items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAction method, of class HServer.
     */
    @org.junit.Test
    public void testInvokeAction() {
        System.out.println("invokeAction");
        HRef id = null;
        String action = "";
        HDict args = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.invokeAction(id, action, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onInvokeAction method, of class HServer.
     */
    @org.junit.Test
    public void testOnInvokeAction() {
        System.out.println("onInvokeAction");
        HDict rec = null;
        String action = "";
        HDict args = null;
        HServer instance = new HServerImpl();
        HGrid expResult = null;
        HGrid result = instance.onInvokeAction(rec, action, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class HServerImpl extends HServer {

        public HOp[] ops() {
            return null;
        }

        public HDict onAbout() {
            return null;
        }

        public Iterator iterator() {
            return null;
        }

        public HGrid onNav(String navId) {
            return null;
        }

        public HDict onNavReadByUri(HUri uri) {
            return null;
        }

        public HWatch onWatchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] onWatches() {
            return null;
        }

        public HWatch onWatch(String id) {
            return null;
        }

        public HGrid onPointWriteArray(HDict rec) {
            return null;
        }

        public HGrid onPointWrite(HDict rec, int level, HVal val, String who, HNum dur, HDict opts) {
            return null;
        }

        public HHisItem[] onHisRead(HDict rec, HDateTimeRange range) {
            return null;
        }

        public void onHisWrite(HDict rec, HHisItem[] items) {
        }

        public HGrid onInvokeAction(HDict rec, String action, HDict args) {
            return null;
        }
    }

    public class HServerImpl extends HServer {

        public HOp[] ops() {
            return null;
        }

        public HDict onAbout() {
            return null;
        }

        public Iterator iterator() {
            return null;
        }

        public HGrid onNav(String navId) {
            return null;
        }

        public HDict onNavReadByUri(HUri uri) {
            return null;
        }

        public HWatch onWatchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] onWatches() {
            return null;
        }

        public HWatch onWatch(String id) {
            return null;
        }

        public HGrid onPointWriteArray(HDict rec) {
            return null;
        }

        public HGrid onPointWrite(HDict rec, int level, HVal val, String who, HNum dur, HDict opts) {
            return null;
        }

        public HHisItem[] onHisRead(HDict rec, HDateTimeRange range) {
            return null;
        }

        public void onHisWrite(HDict rec, HHisItem[] items) {
        }

        public HGrid onInvokeAction(HDict rec, String action, HDict args) {
            return null;
        }
    }

    public class HServerImpl extends HServer {

        public HOp[] ops() {
            return null;
        }

        public HDict onAbout() {
            return null;
        }

        public Iterator iterator() {
            return null;
        }

        public HGrid onNav(String navId) {
            return null;
        }

        public HDict onNavReadByUri(HUri uri) {
            return null;
        }

        public HWatch onWatchOpen(String dis, HNum lease) {
            return null;
        }

        public HWatch[] onWatches() {
            return null;
        }

        public HWatch onWatch(String id) {
            return null;
        }

        public HGrid onPointWriteArray(HDict rec) {
            return null;
        }

        public HGrid onPointWrite(HDict rec, int level, HVal val, String who, HNum dur, HDict opts) {
            return null;
        }

        public HHisItem[] onHisRead(HDict rec, HDateTimeRange range) {
            return null;
        }

        public void onHisWrite(HDict rec, HHisItem[] items) {
        }

        public HGrid onInvokeAction(HDict rec, String action, HDict args) {
            return null;
        }
    }
    
}
