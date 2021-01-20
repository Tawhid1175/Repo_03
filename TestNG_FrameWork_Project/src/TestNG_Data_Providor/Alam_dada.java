package TestNG_Data_Providor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Alam_dada {
	static ChromeDriver driver;
	 @BeforeClass
	  public void OpenApplication() {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();

		 

		 
		 
	  }
	
	
  @Test(dataProvider = "dp")
  public void f(String emailid , String pas) throws InterruptedException {
	  
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(emailid );
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(pas);
	  Thread.sleep(3000);
	  
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
     Thread.sleep(6000);
	 driver.navigate().back(); 
	  
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "alam@gmail.com", "1234" },
      new Object[] { "dada@gmail.com", "1234" },
    };
  }
 

  @AfterClass
  public void afterClass() {
  }

}
