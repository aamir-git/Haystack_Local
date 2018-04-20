/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.server;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.projecthaystack.HDict;

/**
 *
 * @author aamirkhx
 */
public class BMPV2EquipmentTest {
    
    public BMPV2EquipmentTest() {
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
     * Test of addMeter method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddMeter() {
        System.out.println("addMeter");
        HDict site = null;
        String dis = "";
        String markers = "";
        String submeterOf = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addMeter(site, dis, markers, submeterOf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAhu method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddAhu() {
        System.out.println("addAhu");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addAhu(site, dis, markers, refEquip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChiller method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddChiller() {
        System.out.println("addChiller");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        int coolingCapacity = 0;
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addChiller(site, dis, markers, refEquip, coolingCapacity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addChilledWaterPlant method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddChilledWaterPlant() {
        System.out.println("addChilledWaterPlant");
        HDict site = null;
        String dis = "";
        String markers = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addChilledWaterPlant(site, dis, markers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCoolingTower method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddCoolingTower() {
        System.out.println("addCoolingTower");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addCoolingTower(site, dis, markers, refEquip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addStorageTank method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddStorageTank() {
        System.out.println("addStorageTank");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addStorageTank(site, dis, markers, refEquip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHeatExchanger method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddHeatExchanger() {
        System.out.println("addHeatExchanger");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addHeatExchanger(site, dis, markers, refEquip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addBoiler method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddBoiler() {
        System.out.println("addBoiler");
        HDict site = null;
        String dis = "";
        String markers = "";
        String refEquip = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addBoiler(site, dis, markers, refEquip);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addHotWaterPlant method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddHotWaterPlant() {
        System.out.println("addHotWaterPlant");
        HDict site = null;
        String dis = "";
        String markers = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addHotWaterPlant(site, dis, markers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addSteamPlant method, of class BMPV2Equipment.
     */
    @org.junit.Test
    public void testAddSteamPlant() {
        System.out.println("addSteamPlant");
        HDict site = null;
        String dis = "";
        String markers = "";
        BMPV2Equipment instance = new BMPV2Equipment();
        String expResult = "";
        String result = instance.addSteamPlant(site, dis, markers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
