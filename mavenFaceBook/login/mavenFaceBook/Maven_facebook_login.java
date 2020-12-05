package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Maven_facebook_login {
	 static WebDriver driver;
	 @BeforeClass
	  public void beforeClass() {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");

		  
	  }
	
	
  @Test
  public void f() {
  }
 

  @AfterClass
  public void afterClass() {
  }

}
