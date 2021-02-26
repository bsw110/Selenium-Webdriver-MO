package com.hrm.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.Pages.LoginPage;
import com.hrm.base.Base;
import com.hrm.base.BrowserFactory;

public class LoginTestCase2 extends Base{
	
	
	@Test

	public void LoginTest2() {

				
				// create object of using page Factory
				LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
				
				// call the method
				
				login_page.Login_HRM("Admin", "admin123");

				
}
}