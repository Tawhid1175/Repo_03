package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

 public class Pro_05_Yahoo_execution {
	
	 public WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		  
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://login.yahoo.com/");
          driver.manage().window().maximize();
		  
		 
		  
	  }
	
	
	
  @Test
  public void yahoo() {
	  
	  Pro_05_yahoo obj = new Pro_05_yahoo(driver);
	  
	  obj.userRegis1();
	  obj.firstname2();
	  obj.lastname3();
	  obj.useremail4();
	  obj.password5();
	  obj.phonenew6();
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
