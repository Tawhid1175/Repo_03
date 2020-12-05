package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Pro_06_Login_execut {
	public WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
         driver.manage().window().maximize();
		  
		 
		 
	  }

	
  @Test
  public void f() {
	  
	  Pro_06_Login obj =new Pro_06_Login(driver);
	  obj.fblogin();
	  
  }
 
  @AfterMethod
  public void afterMethod() {
	  
  }

}
