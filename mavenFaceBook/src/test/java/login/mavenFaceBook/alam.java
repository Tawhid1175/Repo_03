package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class alam {
	 public WebDriver driver;
	 @BeforeClass
	  public void Launchingapplication() {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
          driver.manage().window().maximize();
		  
		 
		 
	  }	
	
	
	
  @Test
  public void f() {
	  
	  pro_01_logingfb obj = new pro_01_logingfb( driver);
	  
	  obj.alam();
  }
 

  @AfterClass
  public void afterClass() {
  }

}
