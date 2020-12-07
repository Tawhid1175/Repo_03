package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practic {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  

  
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        
        
        Thread.sleep(1000);
       
        Select cc = new Select(driver.findElement(By.id("month")));
        
        cc.selectByVisibleText("Jan");
        
 Select dd = new Select(driver.findElement(By.id("day")));
        
        dd.selectByVisibleText("22");
        
// Select yy = new Select(driver.findElement(By.id("year")));
        
    //    cc.selectByVisibleText("1988");
        
        Select ff = new Select ( driver.findElement(By.id("year")));
        
        ff.selectByVisibleText("1980");
        
        
        
    //   Select cc = new Select(driver.findElement(By.id("month")));
      //    cc.selectByVisibleText("Jan");
        
     /*   Select cc = new Select(driver.findElement(By.id("month")));
        cc.selectByVisibleText("Jan");
        
        Select dd = new Select(driver.findElement(By.id("day")));
        dd.selectByVisibleText("23");
        
        Select ff = new Select ( driver.findElement(By.id("year")));
      
         ff.selectByVisibleText("1980");


	//	Select cc = new Select(driver.findElement(By.id("day")));
		
		//cc.selectByVisibleText("28");
		
		
		//Select dd = new Select(driver.findElement(By.id("year")));
		
		//dd.selectByVisibleText("1987"); */
	}

}
