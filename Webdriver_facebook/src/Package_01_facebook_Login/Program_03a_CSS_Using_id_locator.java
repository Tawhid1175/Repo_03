package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03a_CSS_Using_id_locator {

	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  	
		  // syntax #id
		
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("alam11"); 
	}

}
