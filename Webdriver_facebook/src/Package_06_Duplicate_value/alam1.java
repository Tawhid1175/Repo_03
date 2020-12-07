package Package_06_Duplicate_value;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam1 {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		 
       List<WebElement> dup = driver.findElements(By.name("sex"));
       
         System.out.println( dup.size());
       
     for( int i = 0; i < dup.size(); i++) {
    	 
    	 dup.get(0).click();
     }

                
	}

}
