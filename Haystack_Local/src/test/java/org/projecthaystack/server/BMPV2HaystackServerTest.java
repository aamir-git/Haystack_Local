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
public class BMPV2HaystackServerTest {
    
    public BMPV2HaystackServerTest() {
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
     * Test of bmpInstance method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testBmpInstance() {
        System.out.println("bmpInstance");
        BMPV2HaystackServer expResult = null;
        BMPV2HaystackServer result = BMPV2HaystackServer.bmpInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHandler method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testAddHandler_6args() throws Exception {
        System.out.println("addHandler");
        String dis = "";
        String id = "";
        String markers = "";
        String refEquip = "";
        String submeterOf = "";
        int coolCap = 0;
        BMPV2HaystackServer instance = null;
        String expResult = "";
        String result = instance.addHandler(dis, id, markers, refEquip, submeterOf, coolCap);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHandler method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testAddHandler_5args_1() throws Exception {
        System.out.println("addHandler");
        String dis = "";
        String geoCity = "";
        String geoState = "";
        int area = 0;
        String markers = "";
        BMPV2HaystackServer instance = null;
        String expResult = "";
        String result = instance.addHandler(dis, geoCity, geoState, area, markers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHandler method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testAddHandler_5args_2() throws Exception {
        System.out.println("addHandler");
        String dis = "";
        String id = "";
        String unit = "";
        String markers = "";
        HVal dval = null;
        BMPV2HaystackServer instance = null;
        String expResult = "";
        String result = instance.addHandler(dis, id, unit, markers, dval);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ops method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOps() {
        System.out.println("ops");
        BMPV2HaystackServer instance = null;
        HOp[] expResult = null;
        HOp[] result = instance.ops();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAbout method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnAbout() {
        System.out.println("onAbout");
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onAbout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddSite method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnAddSite() {
        System.out.println("onAddSite");
        String status = "";
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onAddSite(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddEquip method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnAddEquip() {
        System.out.println("onAddEquip");
        String status = "";
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onAddEquip(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onAddPoint method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnAddPoint() {
        System.out.println("onAddPoint");
        String status = "";
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onAddPoint(status);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadById method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnReadById() {
        System.out.println("onReadById");
        HRef id = null;
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onReadById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterator method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testIterator() {
        System.out.println("iterator");
        BMPV2HaystackServer instance = null;
        Iterator expResult = null;
        Iterator result = instance.iterator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJsonFormat method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testToJsonFormat() {
        System.out.println("toJsonFormat");
        HDict dict = null;
        BMPV2HaystackServer instance = null;
        String expResult = "";
        String result = instance.toJsonFormat(dict);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onNav method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnNav() {
        System.out.println("onNav");
        String navId = "";
        BMPV2HaystackServer instance = null;
        HGrid expResult = null;
        HGrid result = instance.onNav(navId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onNavReadByUri method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnNavReadByUri() {
        System.out.println("onNavReadByUri");
        HUri uri = null;
        BMPV2HaystackServer instance = null;
        HDict expResult = null;
        HDict result = instance.onNavReadByUri(uri);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatchOpen method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnWatchOpen() {
        System.out.println("onWatchOpen");
        String dis = "";
        HNum lease = null;
        BMPV2HaystackServer instance = null;
        HWatch expResult = null;
        HWatch result = instance.onWatchOpen(dis, lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatches method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnWatches() {
        System.out.println("onWatches");
        BMPV2HaystackServer instance = null;
        HWatch[] expResult = null;
        HWatch[] result = instance.onWatches();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onWatch method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnWatch() {
        System.out.println("onWatch");
        String id = "";
        BMPV2HaystackServer instance = null;
        HWatch expResult = null;
        HWatch result = instance.onWatch(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onPointWriteArray method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnPointWriteArray() {
        System.out.println("onPointWriteArray");
        HDict rec = null;
        BMPV2HaystackServer instance = null;
        HGrid expResult = null;
        HGrid result = instance.onPointWriteArray(rec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onPointWrite method, of class BMPV2HaystackServer.
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
        BMPV2HaystackServer instance = null;
        HGrid expResult = null;
        HGrid result = instance.onPointWrite(rec, level, val, who, dur, opts);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onHisRead method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnHisRead() {
        System.out.println("onHisRead");
        HDict entity = null;
        HDateTimeRange range = null;
        BMPV2HaystackServer instance = null;
        HHisItem[] expResult = null;
        HHisItem[] result = instance.onHisRead(entity, range);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onHisWrite method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnHisWrite() {
        System.out.println("onHisWrite");
        HDict rec = null;
        HHisItem[] items = null;
        BMPV2HaystackServer instance = null;
        instance.onHisWrite(rec, items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onInvokeAction method, of class BMPV2HaystackServer.
     */
    @org.junit.Test
    public void testOnInvokeAction() {
        System.out.println("onInvokeAction");
        HDict rec = null;
        String action = "";
        HDict args = null;
        BMPV2HaystackServer instance = null;
        HGrid expResult = null;
        HGrid result = instance.onInvokeAction(rec, action, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
