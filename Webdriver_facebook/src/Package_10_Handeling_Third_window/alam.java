package Package_10_Handeling_Third_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alam {

	public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
      
	
		   String current_window = driver.getCurrentUrl();
		   System.out.println(current_window);
		   
		     Actions act = new Actions(driver);
		  
		    WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		    
		      for( int i = 0; i <3; i++) {
		    
		    act.keyDown(Keys.SHIFT).click(forgot).build().perform(); 

		      }
		      
		       Set<String> setwindow = driver.getWindowHandles();
		       
		      Iterator<String> iter = setwindow.iterator();
		      
		      while ( iter.hasNext()) {
		    	  
		    	String Secondwindow = iter.next();
		    	
		    	if ( ! current_window.equals(Secondwindow)) {
		    		
		    		driver.switchTo().window( Secondwindow);
		    		
		    		driver.navigate().to("https://www.youtube.com/");
		    		
		    		break;
		    	}
		
		      }
		      
		      String  thirdwindow = iter.next();
		      
		      if (! current_window.equals(thirdwindow) ) {
		    	  
		    	  driver.switchTo().window(thirdwindow);
		    	  
		    	  driver.navigate().to("https://www.amazon.com/");
		    	 
		    	 
		      }
		      
		      
}
}