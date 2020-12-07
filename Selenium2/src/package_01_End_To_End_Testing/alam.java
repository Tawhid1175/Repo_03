package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\ChromeBrowser\\\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	   
	        driver.manage().window().maximize();
		
	      //create a new account
	        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
            Thread.sleep(3000);
         
		
		
	/*	WebElement fram_one = driver.findElement(By.xpath("//div[@style='opacity: 1; min-width: 472px;']"));
	    driver.switchTo().frame(fram_one);
	      
	    driver.switchTo().defaultContent();
	      
	      WebElement fram_two = driver.findElement(By.xpath("//div[@class='_n3']"));
	    driver.switchTo().frame(fram_two);
	    Thread.sleep(1000);
	      
	     driver.switchTo().defaultContent();
	      
	       
	       WebElement fram_three = driver.findElement(By.xpath("//div[@class='_8ien']"));
	       driver.switchTo().frame(fram_three);*/
	       driver.findElement(By.xpath("//img[contains(@id,'u_11_9')]")).click();
	      
	      Thread.sleep(1000);
	      
	     
	       
	       
	      
	     

	}

}
