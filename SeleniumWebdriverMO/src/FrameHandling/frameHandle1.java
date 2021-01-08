package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandle1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		
		driver.get("https://freecrm.co.in/cb.html");
		
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
		driver.findElement(By.name("email")).sendKeys("qutti2017@gmail.com");
		driver.findElement(By.name("password")).sendKeys("bhavna777");
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	
		
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@class='tasks icon']")).click();
		
		
		
		
	}

}
