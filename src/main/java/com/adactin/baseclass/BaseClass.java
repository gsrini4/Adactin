package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

//Baseclass or reusable methods or library class or utils
// used to maintain all the reusable methods

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browsername) {
		
		if (browsername.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Invalid condition");
		}
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void inputElement(WebElement elementName, String value) {
	
		elementName.sendKeys(value);
	}
	
	public static void clickElement(WebElement elementName) {
		elementName.click();
	}
	
	public static void dropDown(WebElement elementName, String method, String value) {

		Select s = new Select(elementName);
		
		if (method == "index") {
			s.selectByIndex(Integer.parseInt(value));
		}else if (method == "value") {
			s.selectByValue(value);
		}else if (method == "text") {
			s.selectByVisibleText(value);
		}
	}
	
	public static void impliciWait(int seconds) {
		
		driver.manage().timeouts().implicitlyWait(seconds,TimeUnit.SECONDS);
	}
	
	public static void attribute(WebElement elementName, String method, String value) {
			elementName.getAttribute(value);
		}
	
	public static void getSceenshot(String scenario_title) throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+scenario_title+".png");
		FileUtils.copyFile(sourceFile, destFile);
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

