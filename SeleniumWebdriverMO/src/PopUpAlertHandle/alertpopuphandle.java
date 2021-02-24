package PopUpAlertHandle;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopuphandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SOFTWARE\\new chrome exe\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi?mobilelogin=1");
	
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("alert msg is correct");
		}
		else{
			System.out.println("alert msg is wrong");
		}
		
		alert.accept();
		
		//alert.dismiss();
		
		

	}

}
