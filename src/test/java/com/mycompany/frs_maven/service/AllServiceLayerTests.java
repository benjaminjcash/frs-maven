package com.mycompany.frs_maven.service;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FlightSvcTest.class, TravelerSvcTest.class })
public class AllServiceLayerTests {
	
}
