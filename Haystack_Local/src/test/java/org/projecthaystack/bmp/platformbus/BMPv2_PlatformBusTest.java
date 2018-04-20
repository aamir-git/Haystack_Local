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
public class BMPv2_PlatformBusTest {
    
    public BMPv2_PlatformBusTest() {
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
     * Test of pbus_onreceive method, of class BMPv2_PlatformBus.
     */
    @org.junit.Test
    public void testPbus_onreceive() {
        System.out.println("pbus_onreceive");
        String topic = "";
        String payload = "";
        BMPv2_PlatformBus instance = null;
        instance.pbus_onreceive(topic, payload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pbus_send method, of class BMPv2_PlatformBus.
     */
    @org.junit.Test
    public void testPbus_send() {
        System.out.println("pbus_send");
        String destination = "";
        String payload = "";
        BMPv2_PlatformBus instance = null;
        instance.pbus_send(destination, payload);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of connectionLost method, of class BMPv2_PlatformBus.
     */
    @org.junit.Test
    public void testConnectionLost() {
        System.out.println("connectionLost");
        Throwable arg0 = null;
        BMPv2_PlatformBus instance = null;
        instance.connectionLost(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deliveryComplete method, of class BMPv2_PlatformBus.
     */
    @org.junit.Test
    public void testDeliveryComplete() {
        System.out.println("deliveryComplete");
        IMqttDeliveryToken arg0 = null;
        BMPv2_PlatformBus instance = null;
        instance.deliveryComplete(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of messageArrived method, of class BMPv2_PlatformBus.
     */
    @org.junit.Test
    public void testMessageArrived() {
        System.out.println("messageArrived");
        String topic = "";
        MqttMessage message = null;
        BMPv2_PlatformBus instance = null;
        instance.messageArrived(topic, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class BMPv2_PlatformBusImpl extends BMPv2_PlatformBus {

        public BMPv2_PlatformBusImpl() {
            super("");
        }

        public void pbus_onreceive(String topic, String payload) {
        }
    }

    public class BMPv2_PlatformBusImpl extends BMPv2_PlatformBus {

        public BMPv2_PlatformBusImpl() {
            super("");
        }

        public void pbus_onreceive(String topic, String payload) {
        }
    }
    
}
