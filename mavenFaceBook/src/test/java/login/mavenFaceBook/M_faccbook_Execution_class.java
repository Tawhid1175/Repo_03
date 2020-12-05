package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class M_faccbook_Execution_class {
	public WebDriver driver;
	 @BeforeClass
	  public void beforeClass() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
          driver.manage().window().maximize();
		  
		 
	  }
	
	
  @Test
  public void f() {
	  
	  Loginfb obj = new  Loginfb(driver);
	  
	  obj.enteremailid();
	  obj.enterpass();
	  obj.click_login();
  }
 

  @AfterClass
  public void ClosedApplication() {
	  
	  System.out.println(" Close the application");
  }

}
