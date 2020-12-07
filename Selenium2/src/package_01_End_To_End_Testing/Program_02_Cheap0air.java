package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_02_Cheap0air {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.cheapoair.com/flights/booknow/cheap-flights?");
	   
	       driver.manage().window().maximize();
		
	      
	        driver.findElement(By.xpath("//input[contains(@id,'from0')]")).sendKeys("ACY");
	      
	      
	   
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='to0']")).sendKeys("JFK");
		
       Thread.sleep(3000);
		
	   driver.findElement(By.id("cal0")).click();	
		
	   Thread.sleep(3000);
	   
      driver.findElement(By.xpath("(//a[text()='28'])[1]")).click();
      
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).click();
      
      Thread.sleep(3000);
      
     // problem
      
     // driver.findElement(By.className("sv-icon")).click();
      
      
    
      driver.findElement(By.xpath(" (//a[text()='30'])[1]")).click();
      
      Thread.sleep(3000); 
      
      
      driver.findElement(By.xpath("//a[@id='travellerButton']")).click();
      
      Thread.sleep(3000); 



     for   (int i = 0; i < 5; i++  ) 
     {
      
      driver.findElement(By.id("addadults")).click();
      
	}
     
   
     driver.findElement(By.id("addchild")).click();
     
     Thread.sleep(3000); 
     
     driver.findElement(By.name("ChildrenAge")).click();
     
     Thread.sleep(3000); 
     
     
     driver.findElement(By.xpath("//option[text()='7']")).click();
     
     Thread.sleep(3000);
     
    driver.findElement(By.id("addlapinfant")).click();
     
    Thread.sleep(3000); 
     
     driver.findElement(By.id("Class")).click();
     
     Thread.sleep(3000); 
     
    driver.findElement(By.xpath("//option[text()='Business']")).click();
     
    Thread.sleep(3000); 
     
    driver.findElement(By.id("closeDealDialog")).click();
     
    Thread.sleep(3000); 
    
     driver.findElement(By.id("searchNow")).click();
     
	}
}
