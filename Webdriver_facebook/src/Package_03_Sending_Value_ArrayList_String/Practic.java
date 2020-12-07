package Package_03_Sending_Value_ArrayList_String;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\ChromeBrowser\\\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		  
		   String al = " alam , taw";
		   
		   String[] alam = al.split(",");
		   
		   String alam1 = alam[0].trim();
		   String alam2 = alam[1].trim();
		   
		   
		   
		   
		   
		  
		  
	
			  driver.findElement(By.id("email")).sendKeys(alam1);
		         
		      driver.findElement(By.id("pass")).sendKeys(alam2);
		  
		  
	}

}
