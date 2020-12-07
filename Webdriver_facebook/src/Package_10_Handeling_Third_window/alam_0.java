package Package_10_Handeling_Third_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alam_0 {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  
		  String Current_window = driver.getCurrentUrl();
		  System.out.println(Current_window );
		  
		  
		  Actions act = new Actions( driver);
		  
          WebElement til = driver.findElement(By.linkText("Forgot Password?"));	 
          
           for( int a = 0; a<2; a++) {
        	act.keyDown(Keys.SHIFT) .click(til).build().perform();  
        	
        	
        	   
           }
		  
		 Set<String> setwindow = driver.getWindowHandles() ;
		  
		   Iterator<String> iter = setwindow.iterator();
		       
		     while(iter.hasNext()) {
		    	 
		    String secondwindow = iter.next();
		    
		    if(!Current_window.equals(secondwindow)) {
		    	
		    	driver.switchTo().window(secondwindow);
		    	
		    	driver.navigate().to("https://www.google.com/");
				break;
		    }
		    	 
		     }  
		     
		     String thirdwindow = iter.next();
		     
		     if ( !Current_window.equals(thirdwindow) ) {
		    	 
		    	 driver.switchTo().window(thirdwindow);
		     
		     driver.navigate().to("https://www.google.com/gmail/about/#");
		     }   	   
	}

	    

    
	 

		     
	
 }

