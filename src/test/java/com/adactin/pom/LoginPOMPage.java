package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMPage {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement username;

	@FindBy(xpath = "//input[@id='pass']")
	private WebElement password;

	@FindBy(xpath = "//button[@id='loginbutton']")
	private WebElement loginButton;

	public LoginPOMPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
