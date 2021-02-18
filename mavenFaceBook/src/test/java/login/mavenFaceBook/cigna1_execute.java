package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class cigna1_execute {
   public WebDriver driver;
	 @BeforeClass
	  public void beforeClass() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.cigna.com/");
	      driver.manage().window().maximize();
		  
	  }	
	
	
  @Test
  public void f() {
	 
	  cigna1 obj = new cigna1(driver);
	  obj.findDoctor1();
	  obj.medicare2();
	  obj.covit19Button();
  }
 

  @AfterClass
  public void afterClass() {
  }

}
