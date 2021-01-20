package Package_02_Wait_Time;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02_Wait_Time_Implicitly {

	public static void main( String[]args) {
		
		
	    System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		  
		  
		  
		  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alam@gmail.com");
		  
		  //ekhne se 10 second wait korbe na , page ta load howar sate sate back korbe;
		  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  
		  
	      driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
	      
	      
	      
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
}
