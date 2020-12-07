package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06_Qatar_AirWay {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.qatarairways.com/en-us/homepage.html");
	   
	        driver.manage().window().maximize();
		
	        
	        driver.findElement(By.id("T7-from")).sendKeys("JFK");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("T7-to")).sendKeys("Dhaka");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("T7-departure_1")).click();
	        Thread.sleep(3000);
		
            driver.findElement(By.xpath("//td[@data-completedate='15 Sep 2020']")).click();
            
            
            
            driver.findElement(By.xpath("//input[@id='T7-arrival_1']")).click();
	}

}
