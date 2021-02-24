package com.freecrm.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class pro1 {
	@Test
	public  void geturl(){
		
		System.setProperty("webdriver.chrome.driver","F:\\software folder F\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 driver.get("https://classic.freecrm.com/");
		 driver.getTitle();

	}

}
