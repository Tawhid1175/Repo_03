package Package_07_JavaScriptexecution_Dimension_Method;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		   System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		//  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  
		  driver.navigate().to("https://www.facebook.com");

		  
         driver.manage().window().maximize();
         
         Thread.sleep(1000);
         
         JavascriptException js = ( JavascriptException ) driver;
         
           WebElement hiden = driver.findElement(By.linkText("Pages"));
         
         //  js.executeScript(" arguments[0].scrollIntoView();", hiden);
         
         
         // ( " arguments[0].scrollIntoView;", hiden);
           
           
           //(" arguments[0].scrollIntoView;", heden)
         
         
                 
         
         
        // JavascriptException ts = (JavascriptException) driver;
         
     //  ( " scrollBy(0, 5000)")
         
        // ( " arguments[0].scrollIntoView();", ele)
        
     //   ts.executeScript(" arguments[0].scrollIntoView();", ele);
        
       // driver.manage().window().setSize();
        
      //  ts.executeScript(" scrollBy( 0, 5000)");
        
         //ts.executeScript("arguments[0].scrollIntoView();" , ele);
        
  //   scrollBy(0,5000)
  
  //  " arguments[0],scrollIntoView();"//

     
   //  sc.executeScript("arguments[0].scrollIntoView();",ele);
    
   // sc.executeScript("scrollBy(0,5000) ");

   //  document.getElementById('email').value=1234
	  
	//   arguments[0].scrollIntoView();   scrollBy
         
   //  scrollBy
	}
}
