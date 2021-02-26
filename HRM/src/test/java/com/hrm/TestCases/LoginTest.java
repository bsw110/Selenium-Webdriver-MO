package com.hrm.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


import com.hrm.Pages.LoginPage2;


public class LoginTest {

	@Test

	public void LoginTest1() {

		System.setProperty("webdriver.chrome.driver", "F:\\software folder F\\new chrome exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		LoginPage2 Login = new LoginPage2(driver);

		Login.LoginToHrm("Admin", "admin123");
		driver.quit();
	}
		
		
	}
	
	
		


