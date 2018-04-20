/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack.server;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author aamirkhx
 */
@   org.junit.runner.RunWith(org.junit.runners.Suite.class)
@   org.junit.runners.Suite.SuiteClasses({BMPV2StdOpsTest.class, AddSiteTest.class, AddEquipTest.class, AddPointTest.class, HOpTest.class, BMPV2EquipmentTest.class, HServerTest.class, BMPV2HaystackServerTest.class, BMPV2ServletTest.class, HStdOpsTest.class, AboutOpTest.class, OpsOpTest.class, FormatsOpTest.class, ReadOpTest.class, NavOpTest.class, WatchSubOpTest.class, WatchUnsubOpTest.class, WatchPollOpTest.class, PointWriteOpTest.class, HisReadOpTest.class, HisWriteOpTest.class, InvokeActionOpTest.class, BMPV2ServerTest.class})
public class ServerSuite {

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    
}
