


package Locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	//6-LinkText
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.linkText("Forgot your password?")).click();
	
	
	//7- PartialLinkText
	//driver.findElement(By.partialLinkText("Forgot your")).click();
	
	
	//8-TagName
	System.out.println(driver.findElements(By.tagName("img")).size());
	
	
	
	

	}

}
