/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.bmp.platformbus;

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
public class BMPV2PBInterfaceTest {
    
    public BMPV2PBInterfaceTest() {
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
     * Test of bmpPBInstance method, of class BMPV2PBInterface.
     */
    @org.junit.Test
    public void testBmpPBInstance() {
        System.out.println("bmpPBInstance");
        BMPV2PBInterface expResult = null;
        BMPV2PBInterface result = BMPV2PBInterface.bmpPBInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of onPublish method, of class BMPV2PBInterface.
     */
    @org.junit.Test
    public void testOnPublish() {
        System.out.println("onPublish");
        String str = "";
        String ops = "";
        BMPV2PBInterface instance = null;
        instance.onPublish(str, ops);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pbus_onreceive method, of class BMPV2PBInterface.
     */
    @org.junit.Test
    public void testPbus_onreceive() {
        System.out.println("pbus_onreceive");
        String source = "";
        String payload = "";
        BMPV2PBInterface instance = null;
        instance.pbus_onreceive(source, payload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readStatusForMetaStore method, of class BMPV2PBInterface.
     */
    @org.junit.Test
    public void testReadStatusForMetaStore() {
        System.out.println("readStatusForMetaStore");
        String payload = "";
        BMPV2PBInterface instance = null;
        instance.readStatusForMetaStore(payload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
