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
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
         driver.manage().window().maximize();
		  
		 
		 
	  }

	
  @Test
  public void f() {
	 Alam_01 obj = new Alam_01(driver);
	 
	 obj.alam();
	  
  }
 
  @AfterMethod
  public void afterMethod() {
	  
  }

}
