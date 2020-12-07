package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Emirates_airway {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	      
	        driver.get("https://www.emirates.com/us/english/");
	   
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.name("Departure Airport")).clear();
	 Thread.sleep(3000);
	 
	 driver.findElement(By.name("Departure Airport")).sendKeys("JFK");
	 
	 
	 driver.findElement(By.name("Arrival Airport")).sendKeys("DAC");
	 Thread.sleep(3000);
	 
     driver.findElement(By.xpath("//span[text()='Continue']")).click();
	 
	 
   Thread.sleep(5000);
	 
   driver.findElement(By.xpath("(//a[@aria-label='15  Sep 20'])[1]")).click();
	 
	Thread.sleep(3000); 
	
	driver.findElement(By.xpath("(//a[@aria-label='30  Sep 20'])[1]")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.name("Passengers")).click();
	
	
	Thread.sleep(3000);
	
	//driver.findElement(By.xpath("(//span[@class='icon icon-plus'])[1]")).click();
	
	//driver.findElement(By.xpath("(//span[@class='icon icon-plus'])[1]")).click();
	
	//driver.findElement(By.xpath("(//span[@class='icon icon-plus'])[1]")).click();
	
	//driver.findElement(By.xpath("(//span[@class='icon icon-plus'])[1]")).click();
	 
	
	  for( int i=0; i<3; i++) {
		  
		  driver.findElement(By.xpath("(//span[@class='icon icon-plus'])[1]")).click();  
		  
	  }	  
		 
	Thread.sleep(3000);  

	
	driver.findElement(By.id("search-flight-class")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//p[text()='Business Class'])[1]")).click();
	
	Thread.sleep(300);
	
	driver.findElement(By.xpath("(//span[text()='Search flights'])[2]")).click();
	
	Thread.sleep(3000);
	
	
	
	 


	}

}
