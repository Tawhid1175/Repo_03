package TestNG_Data_Providor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class alam1 {
	
	static WebDriver driver;
	  @BeforeClass
	  public void LaunchigApplication() {
		  
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
  
		  
		  
	  }

	
	
  @Test(dataProvider = "dp")
  public void f(String email, String password) throws InterruptedException {
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(email);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(password);
	  Thread.sleep(3000);
	  
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     Thread.sleep(300);
     
     driver.navigate().back();

	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "alam@gmail.com", "1234" },
      new Object[] { " rajib@emil.com", "1234" },
    };
  }

  @AfterClass
  public void afterClass() {
  }

}
