package Package_02_Wait_Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_Navigate_to_back_and_forward {

	public static void main(String[] args) {
		
	
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		  
		  
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alam@gmail.com");
		  
		  
	      driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	    
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();

	}

}
