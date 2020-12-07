package TestNG_Data_Providor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class alam2 {
	static WebDriver driver;
	 @BeforeClass
	  public void LanuchingApplication() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		 
	  }
	
  @Test(dataProvider = "dp")
  public void f(String useremail, String userpass) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).clear();
	  
	  driver.findElement(By.id("email")).sendKeys(useremail);
	  Thread.sleep(1000);
	  
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(userpass);
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(6000);
	  driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "alam@yahoo.com", "1234" },
      new Object[] { "dada@yahoo.com", "5678" },
    };
  }
 

  @AfterClass
  public void ClosedApplication() {
	  
	  System.out.println(" application shoul be closed");
  }

}
