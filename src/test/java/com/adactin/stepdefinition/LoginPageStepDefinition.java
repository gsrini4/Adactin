package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.LoginPOMPage;
import com.adactin.runner.Runner;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginPageStepDefinition extends BaseClass{

	public static WebDriver driver = Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User navigate to adactin application$")
	public void user_navigate_to_adactin_application() throws Throwable {
	   
	   String url = FileReaderManager.getInstance().getCrInstance().getUrl();
	   getUrl(url); 
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String arg1) throws Throwable {
	   
		inputElement(pom.getLogin().getUsername(), arg1);
	 
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
	   
		inputElement(pom.getLogin().getPassword(), arg1);
	}

	@Then("^User valid the username and password$")
	public void user_valid_the_username_and_password() throws Throwable {
	   
		Assert.assertEquals("SowmiyaSrini", pom.getLogin().getUsername().getAttribute("value"));
		Assert.assertEquals("Sowmiya", pom.getLogin().getPassword().getAttribute("value"));
	    
	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
	   
		clickElement(pom.getLogin().getLoginButton());
	}

}
