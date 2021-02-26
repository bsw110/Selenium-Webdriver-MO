package com.hrm.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {
	public WebDriver driver;
	
	//launch the browser and specific url
	@BeforeClass
	public void setup() {
     driver= BrowserFactory.startBrowser(driver, "chrome", "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}
	
	// teardown the browser 
	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	

}
