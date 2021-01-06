




package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//1-id
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
		//2-name
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//3-className
		driver.findElement(By.className("button")).click();
		
		//4-xpath
		driver.findElement(By.xpath("//input[@name=txtUsername")).click();
		driver.findElement(By.xpath(".//input[@id='txtUsername']")).click();
		driver.findElement(By.xpath(".//input[@value='LOGIN']")).clear();
		driver.findElement(By.xpath("//a[contains(@href,'index.php')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'index.php')][text()='Forgot your password?']")).click();
		driver.findElement(By.xpath(".//a[contains(text(),'Forgot your password?')]")).click();
		/*
		 * by using key rightclick on that id /name copy as xpath or copy as cssSelector 
		 */
		//5-cssSelector
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("admin123");
		
		
		
		
	

	}

}

