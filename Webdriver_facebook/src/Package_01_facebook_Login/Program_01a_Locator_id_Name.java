package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01a_Locator_id_Name {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chorme.driver", "C:\\MY Testing File\\Selenium\\Tools");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
   
    
        driver.findElement(By.id("email")).sendKeys("alam@gmail.com");
        Thread.sleep(3000);
        
        driver.findElement(By.id("pass")).sendKeys("1234");
     
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@name='login']")).click();
        
        
    
        
	}

}
