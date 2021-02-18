package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class fb_login_Unique_execution {
	   public WebDriver driver;
	   
	 @BeforeClass
	  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
          driver.manage().window().maximize();
		  
		 
	  }
	
	
  @Test
  public void f() {
	  
	  fb_Login_Unique obj = new  fb_Login_Unique(driver);
	  
	  obj.enterUserEmailAndPassword();
	  
	  
  }
 

  @AfterClass
  public void afterClass() {
  }

}
