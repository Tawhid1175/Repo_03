package Package_04_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_01_Login {

	public static void main(String[] args) throws InterruptedException {
		
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.amazon.com/");
	        
         driver.manage().window().maximize();
	      
	      // create account section e gelm
	      
	     WebElement amazon = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	     
	     Actions act = new Actions(driver);
	     
	     act.moveToElement(amazon).build().perform();
	     
	     // Click on sign in butten
		
	     Thread.sleep(5000); 
	     
	     driver.findElement(By.linkText("Sign in")).click();
	     
	     driver.findElement(By.id("ap_email")).sendKeys("alam@gamil.com");
	   
		driver.findElement(By.id("continue")).click();
		
		 Thread.sleep(5000);
		// sending value in the password filed
		
       driver.findElement(By.id("ap_password")).sendKeys("12344");
       
       Thread.sleep(3000);
       
       // click on sign in button
       
       driver.findElement(By.id("signInSubmit")).click();

		
		

	}

}
