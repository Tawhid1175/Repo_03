package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_facebook_Login {

	public static void main(String[] args) throws InterruptedException {
		
		
	       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	   
	        driver.manage().window().maximize();
		
		  driver.findElement(By.id("email")).sendKeys("alam@gamil.com");
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(3000);
		  
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		  


		  
	}

}
