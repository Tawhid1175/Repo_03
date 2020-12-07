package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05_Locator_linkText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
         
		 driver.findElement(By.linkText("Data Policy")).click();
		 
		 driver.findElement(By.name("websubmit")).click();
	}

}
