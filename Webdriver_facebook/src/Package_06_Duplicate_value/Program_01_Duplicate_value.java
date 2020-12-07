package Package_06_Duplicate_value;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Duplicate_value {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		 
		  driver.findElement(By.xpath("//*[contains(@id,'u_0_2')]")).click();
		  
		  Thread.sleep(5000);

		List<WebElement> duplicate = driver.findElements(By.name("sex")) ;
		System.out.println("Total duplicate element :" + duplicate.size());
		
		for ( int i= 0; i < duplicate.size(); i++) {
			
			duplicate.get(0).click();
		}
		
		


		
		
	}

}
