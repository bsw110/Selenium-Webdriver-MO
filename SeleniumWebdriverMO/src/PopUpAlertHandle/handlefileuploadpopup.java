package PopUpAlertHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlefileuploadpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.cssSelector("#fileupload")).sendKeys("E:\\Doc1.docx");
		

	}

}
