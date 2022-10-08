package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.LoginPOMPage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private LoginPOMPage login;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPOMPage getLogin() {
		login = new LoginPOMPage(driver);
		return login;
	}
	
}
