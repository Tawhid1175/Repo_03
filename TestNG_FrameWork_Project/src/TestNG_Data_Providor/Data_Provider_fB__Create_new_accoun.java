package TestNG_Data_Providor;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Data_Provider_fB__Create_new_accoun {
	 static WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		
	  }
	
	
	
  @Test(dataProvider = "dp")
  public void f(String userfirstname, String userlastname, String useremailid, String userpassword,String userrepassword) throws InterruptedException {
	  
	 
	

	      
      
	   driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
       Thread.sleep(3000);
       
       driver.findElement(By.name("firstname")).clear();
       driver.findElement(By.name("firstname")).sendKeys(userfirstname);
       Thread.sleep(3000);
       
       //lastname field
       driver.findElement(By.name("lastname")).clear();
       driver.findElement(By.name("lastname")).sendKeys(userlastname);
       Thread.sleep(3000);
       
       //email field
       driver.findElement(By.name("reg_email__")).clear();
       driver.findElement(By.name("reg_email__")).sendKeys(useremailid);
       Thread.sleep(3000);
       
       //password field
       driver.findElement(By.name("reg_passwd__")).clear();
       driver.findElement(By.name("reg_passwd__")).sendKeys(userpassword);
       Thread.sleep(3000);
       
       //reset password
       driver.findElement(By.name("reg_email_confirmation__")).clear();
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys(userrepassword);
       Thread.sleep(3000);
      
       
      // drop downlist , select the month by using select class
       
       Select mm = new Select(driver.findElement(By.id("month")));
       mm.selectByVisibleText("Jan");
       Thread.sleep(3000);
       
       // Select the day
       Select dd = new Select(driver.findElement(By.id("day")));
       dd.selectByVisibleText("24");
       Thread.sleep(3000);
      
       
       // Select the year
       Select yy = new Select(driver.findElement(By.id("year")));
       yy.selectByVisibleText("1987");
       Thread.sleep(3000);
       
       //Click the Radio button
       driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
       Thread.sleep(3000);
       
       // click on sign up button
       driver.findElement(By.name("websubmit")).click();
       
       Thread.sleep(1000);
       
   /*  WebElement fram_one = driver.findElement(By.xpath("//iframe[@id='u_0_c']"));
     driver.switchTo().frame(fram_one);
      
     driver.switchTo().defaultContent();
      
      WebElement fram_two = driver.findElement(By.xpath("//iframe[@id='u_0_d']"));
    driver.switchTo().frame(fram_two);
    Thread.sleep(1000);
      
     driver.switchTo().defaultContent();
      
       
       WebElement fram_three = driver.findElement(By.xpath("//div[@class='_8ien']"));
       driver.switchTo().frame(fram_three);
       driver.findElement(By.xpath("//img[contains(@id,'u_11_9')]")).click();
      
      Thread.sleep(1000); */
      
      driver.findElement(By.className("_8idr img")).click();
       
       Thread.sleep(1000);
      
     
      
     driver.navigate().back();
     Thread.sleep(7000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "alam", "tawhid" , " alam@gamil.com"," 1234", "1234"},
      new Object[] { "rajib", "chowdhary" ," rajib@gamil.com"," 1234", "1234"},
     new Object[] { "dada", "avijit" , " dada@gamil.com"," 1234", "1234"},
     new Object[] { "sarwar", "jaman" , " jaman@gamil.com"," 1234", "1234"},
     new Object[] { "faisal", "noor" , " roor@gamil.com"," 1234", "1234"},

    };
  }
  

  @AfterClass
  public void closeApplication() {
	  
	  System.out.println(" closed the application");
  }

}
