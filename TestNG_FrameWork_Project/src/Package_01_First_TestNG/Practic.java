package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Practic {
 static   WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		

	}	  
		
		
	  
	
	
  @Test( timeOut=3000)
  public void f() {
	  
	  

	  
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alam@gmail.com");
	  
	

  }
  

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alam@gmail.com");
  }

}
