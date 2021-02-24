package FrameHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/User/Desktop/test%20data%20excel/iframe3.html");
		
		driver.switchTo().frame("selenium");
		
		driver.findElement(By.xpath("//input[@type='First Name']")).sendKeys("admin");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("/html/body/a")).click();
		
		driver.navigate().back();
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("seleniumhq");// it accepts only id name
		
		driver.findElement(By.xpath("//a[@id='dropdownButton']")).click();
		
		driver.switchTo().defaultContent();
		// conunt total frames in pages
		
		int total_frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("total frames" + total_frames);
		
		
		
		
		
		
	}

}
