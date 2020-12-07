package Package_02_Wait_Time;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Launch_page_Thread_sleep_using_Navigate {

	public static void main(String[] args) throws InterruptedException {
		  
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		  
		  
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alam@gmail.com");
		  
		  Thread.sleep(5000);
		  
		  
		  
	      driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	      
	      Thread.sleep(5000);
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
