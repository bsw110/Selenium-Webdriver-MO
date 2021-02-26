package com.hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//POM-1 BASIC[without PageFactory]  class LoginPage2-LoginTest
public class LoginPage2 {
	WebDriver driver;
	// Locators
	
	By username=By.id("txtUsername");
	By passward=By.id("txtPassword");
	By loginButton=By.id("btnLogin");
	
	// constructor
	
	public LoginPage2(WebDriver driver) {
		this.driver=driver;
		}
	
	//Methods
	public void LoginToHrm(String uid,String pwd) {
	
		driver.findElement(username).sendKeys(uid);
		driver.findElement(passward).sendKeys(pwd);
		driver.findElement(loginButton).click();
	}

}
