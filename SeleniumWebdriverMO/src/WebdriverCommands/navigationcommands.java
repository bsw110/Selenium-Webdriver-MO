package WebdriverCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https:www.google.com");
		
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		
		driver.navigate().to("https:www.amazon.in");
		
		
		driver.navigate().refresh();
		
		// navigate.to(url)  and  driver.get(url) both launch the url but navigate.to(url) used for launch external url
		
				
		
	}

}
