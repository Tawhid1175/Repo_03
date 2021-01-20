package Package_10_Handeling_Third_window;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_Handel_ThirdWindow {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  String initialwindow = driver.getWindowHandle();
		  System.out.println(initialwindow);
		 
		// session id er upr nirvot kore window ta adik odik jai 
		  // sekhne  multifal session id lage
		  Actions act = new Actions(driver);
		  WebElement forgot = driver.findElement(By.linkText("Forgot Password?"));
		  
		 // act.keyDown(Keys.SHIFT).click(forgot).build().perform();
		  
		  for(int i = 0; i <=1; i++) {
			  
			  act.keyDown(Keys.SHIFT).click(forgot).build().perform();	
			  
		  }
		  // Iterator = er ortho holo ghure , one after anothe,
	      // mone ektar por ekta asbe
		  // window handel session id ke store kore
		  
		      Set<String> setwindow = driver.getWindowHandles(); // session id will be handled by setwindow
		      
		    Iterator<String> itr = setwindow.iterator();
		    
		    while( itr.hasNext()) {
		    	
		    String secondwindow =itr.next();
		    
		    // selenium ont equal bujate ! use kore
		    
		    if (! initialwindow.equals(secondwindow) ) {
		    	
		    	// if (! initialwindow ! =(secondwindow) )
		    	
		    	driver.switchTo().window(secondwindow);
		    	
		    	driver.navigate().to("https://www.google.com/");
		    	break;
		    	
		    }
		    }
		    
  String thirdwindow=itr.next();
		    
		    // selenium Not equal bujate ! use kore
		    
		    if (! initialwindow.equals(thirdwindow) ) {
		    	

           	 driver.switchTo().window(thirdwindow);
		    	
		    driver.navigate().to("https://www.google.com/gmail/about/#");
		    
		    driver.switchTo().window(initialwindow)	;
		    	
		    }		    	
		    }		    
	    	
		    	
	}


