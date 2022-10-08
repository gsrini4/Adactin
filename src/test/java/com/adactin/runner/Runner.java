package com.adactin.runner;

import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					glue = "src\\test\\java\\com\\adactin\\stepdefinition",
					monochrome = true,
					dryRun=false,
					strict = true,
					//tags = {"@SmokeTest, ~@SmokeTest"},
					plugin = {"pretty",
							  "html:htmlReport",
							  "json:JsonReport/report",
							  "com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/report.html"}
		)


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver = BaseClass.browserLaunch(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}

}
