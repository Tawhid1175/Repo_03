package Package_10_Handeling_Third_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alam1 {

	private static Object brack;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		      String current_window = driver.getWindowHandle();
		      System.out.println(current_window);
		      
		      Actions act = new Actions(driver);
		      
		    WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		    
		    for ( int a =0; a < 2; a++) {
		    
		    act.keyDown(Keys.SHIFT).click(forgot).build().perform();
		    }


		    	 Set<String> setwindow = driver.getWindowHandles(); 
		    	 
		    	    Iterator<String> iter = setwindow.iterator();
		    	    
		    	    while(iter.hasNext());
		    	     String secondwindow = iter.next();
		    	     
		    	     if (!current_window.equals(secondwindow)) {
		    	    	 
		    	    	  driver.switchTo().window(secondwindow);
		    	    	  
		    	    	  driver.navigate().to("https://www.google.com/");
		    	    	
		    	    	  
		    	     }
		    		 
		    		 
		    	     
		    		  
		    		 
		    	 }



		       
		     	     




		  
		/*  String initialwindow = driver.getWindowHandle();
		  System.out.println(initialwindow);
		 
		

		  Actions act = new Actions(driver);
		  WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		  
		 // act.keyDown(Keys.SHIFT).click(forgot).build().perform();
		  
		  for(int i = 0; i <=1; i++) {
			  
			  act.keyDown(Keys.SHIFT).click(forgot).build().perform();	
			  
		  }
	
	      Set<String> setwindow = driver.getWindowHandles(); // session id will be handled by setwindow
		      
		    Iterator<String> itr = setwindow.iterator();
		    
		    while( itr.hasNext()) {
		    	
		    String secondwindow =itr.next();
		
    if (! initialwindow.equals(secondwindow) ) {
		    	
		    	// if (! initialwindow ! =(secondwindow) )
		    	
		    	driver.switchTo().window(secondwindow);
		    	
		    	driver.navigate().to("https://www.google.com/");
		    	break;
		    	
		    }

	}
*/
	}

