/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.client;

import java.net.HttpURLConnection;
import java.net.URL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.projecthaystack.HDict;
import org.projecthaystack.HGrid;
import org.projecthaystack.HHisItem;
import org.projecthaystack.HNum;
import org.projecthaystack.HRef;
import org.projecthaystack.HVal;
import org.projecthaystack.HWatch;

/**
 *
 * @author aamirkhx
 */
public class HClientTest {
    
    public HClientTest() {
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
     * Test of open method, of class HClient.
     */
    @org.junit.Test
    public void testOpen_3args() {
        System.out.println("open");
        String uri = "";
        String user = "";
        String pass = "";
        HClient expResult = null;
        HClient result = HClient.open(uri, user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class HClient.
     */
    @org.junit.Test
    public void testOpen_5args() {
        System.out.println("open");
        String uri = "";
        String user = "";
        String pass = "";
        int connectTimeout = 0;
        int readTimeout = 0;
        HClient expResult = null;
        HClient result = HClient.open(uri, user, pass, connectTimeout, readTimeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConnectTimeout method, of class HClient.
     */
    @org.junit.Test
    public void testSetConnectTimeout() {
        System.out.println("setConnectTimeout");
        int timeout = 0;
        HClient instance = null;
        HClient expResult = null;
        HClient result = instance.setConnectTimeout(timeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReadTimeout method, of class HClient.
     */
    @org.junit.Test
    public void testSetReadTimeout() {
        System.out.println("setReadTimeout");
        int timeout = 0;
        HClient instance = null;
        HClient expResult = null;
        HClient result = instance.setReadTimeout(timeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeouts method, of class HClient.
     */
    @org.junit.Test
    public void testSetTimeouts() {
        System.out.println("setTimeouts");
        int connectTimeout = 0;
        int readTimeout = 0;
        HClient instance = null;
        HClient expResult = null;
        HClient result = instance.setTimeouts(connectTimeout, readTimeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open method, of class HClient.
     */
    @org.junit.Test
    public void testOpen_0args() {
        System.out.println("open");
        HClient instance = null;
        HClient expResult = null;
        HClient result = instance.open();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of about method, of class HClient.
     */
    @org.junit.Test
    public void testAbout() {
        System.out.println("about");
        HClient instance = null;
        HDict expResult = null;
        HDict result = instance.about();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ops method, of class HClient.
     */
    @org.junit.Test
    public void testOps() {
        System.out.println("ops");
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.ops();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of formats method, of class HClient.
     */
    @org.junit.Test
    public void testFormats() {
        System.out.println("formats");
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.formats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadById method, of class HClient.
     */
    @org.junit.Test
    public void testOnReadById() {
        System.out.println("onReadById");
        HRef id = null;
        HClient instance = null;
        HDict expResult = null;
        HDict result = instance.onReadById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadByIds method, of class HClient.
     */
    @org.junit.Test
    public void testOnReadByIds() {
        System.out.println("onReadByIds");
        HRef[] ids = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.onReadByIds(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onReadAll method, of class HClient.
     */
    @org.junit.Test
    public void testOnReadAll() {
        System.out.println("onReadAll");
        String filter = "";
        int limit = 0;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.onReadAll(filter, limit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eval method, of class HClient.
     */
    @org.junit.Test
    public void testEval() {
        System.out.println("eval");
        String expr = "";
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.eval(expr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalAll method, of class HClient.
     */
    @org.junit.Test
    public void testEvalAll_StringArr() {
        System.out.println("evalAll");
        String[] exprs = null;
        HClient instance = null;
        HGrid[] expResult = null;
        HGrid[] result = instance.evalAll(exprs);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalAll method, of class HClient.
     */
    @org.junit.Test
    public void testEvalAll_StringArr_boolean() {
        System.out.println("evalAll");
        String[] exprs = null;
        boolean checked = false;
        HClient instance = null;
        HGrid[] expResult = null;
        HGrid[] result = instance.evalAll(exprs, checked);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evalAll method, of class HClient.
     */
    @org.junit.Test
    public void testEvalAll_HGrid_boolean() {
        System.out.println("evalAll");
        HGrid req = null;
        boolean checked = false;
        HClient instance = null;
        HGrid[] expResult = null;
        HGrid[] result = instance.evalAll(req, checked);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchOpen method, of class HClient.
     */
    @org.junit.Test
    public void testWatchOpen() {
        System.out.println("watchOpen");
        String dis = "";
        HNum lease = null;
        HClient instance = null;
        HWatch expResult = null;
        HWatch result = instance.watchOpen(dis, lease);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watches method, of class HClient.
     */
    @org.junit.Test
    public void testWatches() {
        System.out.println("watches");
        HClient instance = null;
        HWatch[] expResult = null;
        HWatch[] result = instance.watches();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watch method, of class HClient.
     */
    @org.junit.Test
    public void testWatch() {
        System.out.println("watch");
        String id = "";
        boolean checked = false;
        HClient instance = null;
        HWatch expResult = null;
        HWatch result = instance.watch(id, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchSub method, of class HClient.
     */
    @org.junit.Test
    public void testWatchSub() {
        System.out.println("watchSub");
        HClient.HClientWatch w = null;
        HRef[] ids = null;
        boolean checked = false;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.watchSub(w, ids, checked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchUnsub method, of class HClient.
     */
    @org.junit.Test
    public void testWatchUnsub() {
        System.out.println("watchUnsub");
        HClient.HClientWatch w = null;
        HRef[] ids = null;
        HClient instance = null;
        instance.watchUnsub(w, ids);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchPoll method, of class HClient.
     */
    @org.junit.Test
    public void testWatchPoll() {
        System.out.println("watchPoll");
        HClient.HClientWatch w = null;
        boolean refresh = false;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.watchPoll(w, refresh);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of watchClose method, of class HClient.
     */
    @org.junit.Test
    public void testWatchClose() {
        System.out.println("watchClose");
        HClient.HClientWatch w = null;
        boolean send = false;
        HClient instance = null;
        instance.watchClose(w, send);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pointWrite method, of class HClient.
     */
    @org.junit.Test
    public void testPointWrite() {
        System.out.println("pointWrite");
        HRef id = null;
        int level = 0;
        String who = "";
        HVal val = null;
        HNum dur = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.pointWrite(id, level, who, val, dur);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pointWriteArray method, of class HClient.
     */
    @org.junit.Test
    public void testPointWriteArray() {
        System.out.println("pointWriteArray");
        HRef id = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.pointWriteArray(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisRead method, of class HClient.
     */
    @org.junit.Test
    public void testHisRead() {
        System.out.println("hisRead");
        HRef id = null;
        Object range = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.hisRead(id, range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hisWrite method, of class HClient.
     */
    @org.junit.Test
    public void testHisWrite() {
        System.out.println("hisWrite");
        HRef id = null;
        HHisItem[] items = null;
        HClient instance = null;
        instance.hisWrite(id, items);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of invokeAction method, of class HClient.
     */
    @org.junit.Test
    public void testInvokeAction() {
        System.out.println("invokeAction");
        HRef id = null;
        String action = "";
        HDict args = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.invokeAction(id, action, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of call method, of class HClient.
     */
    @org.junit.Test
    public void testCall() {
        System.out.println("call");
        String op = "";
        HGrid req = null;
        HClient instance = null;
        HGrid expResult = null;
        HGrid result = instance.call(op, req);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of openHttpConnection method, of class HClient.
     */
    @org.junit.Test
    public void testOpenHttpConnection() throws Exception {
        System.out.println("openHttpConnection");
        URL url = null;
        String method = "";
        int connectTimeout = 0;
        int readTimeout = 0;
        HttpURLConnection expResult = null;
        HttpURLConnection result = HClient.openHttpConnection(url, method, connectTimeout, readTimeout);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeClient method, of class HClient.
     */
    @org.junit.Test
    public void testMakeClient() throws Exception {
        System.out.println("makeClient");
        String uri = "";
        String user = "";
        String pass = "";
        HClient expResult = null;
        HClient result = HClient.makeClient(uri, user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class HClient.
     */
    @org.junit.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        HClient.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
