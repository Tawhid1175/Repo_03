package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practic_03 {
	 static  WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
	  }
	
  @Test
  public void facebook_Login() throws InterruptedException {
	  
	  driver.findElement(By.id("email")).sendKeys("alam@gmail.com");
      Thread.sleep(3000);
      
      driver.findElement(By.id("pass")).sendKeys("1234");
   
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//button[@name='login']")).click();
      
      
	  
	 
  }
  

  @AfterClass
  public void afterClass() {
	  
	  System.out.println(" closed the browser");
  }

}
