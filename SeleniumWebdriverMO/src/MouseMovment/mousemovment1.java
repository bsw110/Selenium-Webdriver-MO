package MouseMovment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemovment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://freecrm.co.in/cb.html");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("CRM"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Dental CRM")).click();
		

	}

}
