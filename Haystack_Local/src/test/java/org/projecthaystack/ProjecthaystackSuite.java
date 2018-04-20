/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projecthaystack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.projecthaystack.auth.AuthSuite;
import org.projecthaystack.bmp.BmpSuite;
import org.projecthaystack.client.ClientSuite;
import org.projecthaystack.io.IoSuite;
import org.projecthaystack.server.ServerSuite;
import org.projecthaystack.util.UtilSuite;

/**
 *
 * @author aamirkhx
 */
@   org.junit.runner.RunWith(org.junit.runners.Suite.class)
@   org.junit.runners.Suite.SuiteClasses({HDateTimeTest.class, HFilterTest.class, BmpSuite.class, UnknownWatchExceptionTest.class, HRefTest.class, HTimeZoneTest.class, ClientSuite.class, HXStrTest.class, IoSuite.class, HRemoveTest.class, HWatchTest.class, HListTest.class, UtilSuite.class, HMarkerTest.class, HBoolTest.class, AuthSuite.class, HRowTest.class, ParseExceptionTest.class, HHisItemTest.class, HDateTest.class, HNATest.class, HBinTest.class, UnknownRecExceptionTest.class, HStrTest.class, HValTest.class, UnknownNameExceptionTest.class, HProjTest.class, HTimeTest.class, HNumTest.class, HUriTest.class, HColTest.class, HGridTest.class, HDictTest.class, ServerSuite.class, HDictBuilderTest.class, HGridBuilderTest.class, HDateTimeRangeTest.class, HCoordTest.class})
public class ProjecthaystackSuite {

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
