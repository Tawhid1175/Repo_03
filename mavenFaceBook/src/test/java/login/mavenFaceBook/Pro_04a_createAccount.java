package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Pro_04a_createAccount {
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
	  
	  pro_04a_CreateAccount obj = new pro_04a_CreateAccount( driver);
	  
	  obj.CreateNewAccountMethod();
	  
  }
 

  @AfterClass
  public void afterClass() {
  }

}
