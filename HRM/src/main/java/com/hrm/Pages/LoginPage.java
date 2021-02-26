package com.hrm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
// POM-2 by using page Factory-
//class LoginPage-BrowserFactory-LoginTestCase2
public class LoginPage  {
	
	WebDriver driver;
	
	//Locators
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement passward;

	@FindBy(id="btnLogin")
	WebElement Loginbtn;
	
	@FindBy(linkText="Forgot your password?")
	WebElement Forgot_passward_Link;
	
	//Constructor
	
	public LoginPage(WebDriver driver)
	 {
		this.driver=driver;
	 }
	
	
	//Method
	
	public void Login_HRM(String uid,String pwd) {
		username.sendKeys(uid);
		passward.sendKeys(pwd);
		Loginbtn.click();
		
	}

	

}
