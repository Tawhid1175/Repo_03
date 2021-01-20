package Package_05_Action_class;

import java.awt.Desktop.Action;
import java.awt.Dimension;
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {



	      public static void main(String[] args) throws IOException, InterruptedException {
	    	  
	    	  
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.facebook.com");

           
		   driver.manage().window().maximize();
      
		  
		   
		 Actions act = new Actions(driver); 
		 
		 WebElement small = driver.findElement(By.id("email"));
		 
		 act.moveToElement(small).keyDown(Keys.SHIFT).sendKeys("amm").build().perform();
		   
		   
		     
		      
		    //  String tab = Keys.chord(Keys.CONTROL, Keys.ENTER);
		      
		    /*  WebElement window = driver.findElement(By.linkText("Forgot Password?"));
		      
		    act.moveToElement(window).keyDown(Keys.SHIFT).sendKeys("alal").build().perform();
		    
		    act.moveToElement(window).contextClick().build().perform();
		     
		    act.dragAndDropBy(window, 4000, 0) .build().perform();
		    
		    driver.switchTo().alert().dismiss(); */
		     
		
   // WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		  
 
    
//http://testautomationpractice.blogspot.com/ 

        }

	}
	
  
		  
	

 //  "//button[@onclick='myFunction()'"
        
       //"http://testautomationpractice.blogspot.com/ 	 
         
         
	 
  
  

			 
		 //button[@ondblclick='myFunction1()']


     
     
	


