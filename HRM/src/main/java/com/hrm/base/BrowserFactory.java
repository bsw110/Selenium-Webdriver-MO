package com.hrm.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver driver;

	public static WebDriver startBrowser(WebDriver driver,String browsername, String url) {

		if (browsername.equals("firfox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\selenium projects\\HRM\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}else if(browsername.equalsIgnoreCase("IE")) {
			driver= new InternetExplorerDriver();
			
		}
		else {
			System.out.println("dose not support this browser");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
		
		public static void quitBrowser(WebDriver driver) {
			
			driver.quit();
		}
	

	
	}


