package Package_05_Action_class;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_01_opening_new_tap {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to(" https://www.facebook.com");
		 
		  //action holo ekta class
		  //Selenium er keyboard abong mouse er kaj 
		  //new tab open
		  
		  
		  Actions act = new Actions(driver);
		  

		  String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  driver.findElement(By.linkText("Forgot Password?")).sendKeys(tab);
		  
		
		

	}

}
