
package TestNG_Data_Providor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
// multifall Data provides korar jnno amr data provider use korbo

public class Data_ProVider {
	static  WebDriver driver;
	
	 @BeforeClass
	  public void OpenApplication() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		 
	  }
	
  @Test(dataProvider = "dp")
  public void f( String usernamefield, String passwordfield) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(usernamefield);
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(passwordfield);
	  Thread.sleep(3000);
	  
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     Thread.sleep(6000);
	 driver.navigate().back(); 
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "alam@gamil.com", "12345" },
      new Object[] { "rajib@gamil.com", "12345" },
      new Object[] { "dada@gamil.com", "12345" },
      new Object[] { "alam11@gamil.com", "12345" },
      new Object[] { "tawhid@gamil.com", "12345" },
      
    };
  }
 

  @AfterClass
  public void closingApplication() {
	  
	  System.out.println(" Close the application");
  }

}
