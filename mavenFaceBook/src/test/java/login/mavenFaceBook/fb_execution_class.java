package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class fb_execution_class {
  public WebDriver driver;

@BeforeClass
public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
      driver.manage().window().maximize();
	  
	
}

	
  @Test
  public void f() throws InterruptedException {
	  faccbook_Login obj = new faccbook_Login(driver);
	  
	  obj.enterEmail1("tawhid@gamai.com");
	  Thread.sleep(1000);
	  obj.passwordid1("1234");
	  Thread.sleep(1000);
	  obj.email1();
	  
  }
  @AfterClass
  public void afterClass() {
  }

}
