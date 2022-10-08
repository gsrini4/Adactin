package com.adactin.helper;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends BaseClass{

	@Before
	public void beforeHooks(Scenario scenario) {
		
		String scenarioName = scenario.getName();
		System.out.println("Scenario = "+scenarioName);
		
	}
	
	@After
	public void afterHooks(Scenario scenario) throws Exception {

		String status = scenario.getStatus();
		System.out.println("scenario status= "+status);
		if (scenario.isFailed()) {
			getSceenshot(scenario.getName());
		}
	}
}
