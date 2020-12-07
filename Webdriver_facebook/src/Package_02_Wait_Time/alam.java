package Package_02_Wait_Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		    
	
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    driver.navigate().back();
		    
		    driver.navigate().forward();
		    
		    
		  List<WebElement> al = driver.findElements(By.tagName("a"));
		  
		  System.out.println(al.size());
		  
		  for ( WebElement e:al) {
			  
			  System.out.println(e.getText());
		  }
		  
		  
		  
    /* List<WebElement> alllinks = driver.findElements(By.tagName("a"));
     
     System.out.println(alllinks.size());
     
     for( WebElement e: alllinks) {
    	 
    	 System.out.println(e.getText());
     }
     */
       



		

	}

}
