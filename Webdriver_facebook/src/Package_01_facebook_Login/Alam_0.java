package Package_01_facebook_Login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alam_0 {

	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
		  
		  
		     
			 
			 ArrayList <String>tabs = new ArrayList<String>(driver.getWindowHandles());
	         driver.switchTo().window(tabs.get(0));
			 
	         driver.findElement(By.linkText("Services")).click();

		     driver.findElement(By.linkText("Pages")).click();
			 
		
			 
			 

			

	}

}
