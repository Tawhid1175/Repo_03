package Package_05_Action_class;

import java.awt.RenderingHints.Key;

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
		  driver.navigate().to(" https://www.facebook.com");
		  
		    
		  
		  Actions act = new Actions(driver);
		  
		 
		 
		 
		  WebElement window = driver.findElement(By.linkText("Forgot Password?"));
		  
		  act.moveToElement(window).moveToElement(window).build().perform();
		  
		  
		  act.dragAndDropBy(window,4000 , 0).build().perform();
		  
		  driver.switchTo().alert().accept();
		 
	}

}
