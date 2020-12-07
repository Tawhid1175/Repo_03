package Package_04_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_Buy_a_product {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.amazon.com/");
	        
         driver.manage().window().maximize();
         
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11 Pro Max Unlocked renewed");
         
         Thread.sleep(3000);
	      
		 driver.findElement(By.xpath("(//input[@class='nav-input'])[2]")).click();
		 
		  Thread.sleep(3000) ;
		  
		  driver.findElement(By.linkText("Apple iPhone 11 Pro Max (64GB, Silver) [Locked] + Cricket Wireless Plan")).click();
		  
		  Thread.sleep(3000) ;
		 
		 
		  driver.findElement(By.xpath("(//li[@class='a-spacing-small twister-margin'])[2]")).click();
		 
		  Thread.sleep(3000) ;
		  
		  driver.findElement(By.xpath("(//li[@class='a-spacing-small twister-margin'])[6]")).click();
	}

}
