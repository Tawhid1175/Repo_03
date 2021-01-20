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
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  
		 String current_window = driver.getCurrentUrl();
		 System.out.println(current_window);
		 
		 Actions act = new Actions(driver);
		 
		WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		
		 for ( int a =0; a< 3;a++ ) {
			 
			act.keyDown(Keys.SHIFT).click(forgot).build().perform();
		 }
		 
		  Set<String> setwindow = driver.getWindowHandles();
		  
		     Iterator<String> iter = setwindow.iterator();
		     
		     while (iter.hasNext()) {
		    	 
		    	String second = iter.next();
		    	
		    	if ( !current_window.equals(second)) {
		    		
		    		driver.switchTo().window(second);
		    		
		    		driver.navigate().to("https://www.youtube.com/");
		    		break;
		    	}
		    	 
		    	 
		     }
		    
		     String third = iter.next();
		     if (!current_window.equals(third) ) {
		    	 
		     driver.switchTo().window(third);
		    	 
		     driver.navigate().to("https://www.amazon.com/");
		     
		     
		     }
	

	    

    
	 

  }	     
	
 }

