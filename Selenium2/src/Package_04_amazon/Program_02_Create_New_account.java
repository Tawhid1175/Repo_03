package Package_04_amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_02_Create_New_account {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	       WebDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.amazon.com/");
	   
	      driver.manage().window().maximize();
	      
	      // create account section e gelm
	      
	     WebElement amazon = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	     
	     Actions act = new Actions(driver);
	     
	     act.moveToElement(amazon).build().perform();
		
	     Thread.sleep(5000);
	     
	     // here giye click korlm
	     
	   WebElement Buy = driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
	  


		
		//create new account aslo
	     
	     driver.findElement(By.id("ap_customer_name")).sendKeys(" T alam");
	     
	     //customer name send korlm
	     
	     driver.findElement(By.id("ap_email")).sendKeys("alam@gamil.com");
	     //email id patalm
	     
	     
	     driver.findElement(By.id("ap_password")).sendKeys("rajib12345");
	     
	     //sendind password
	     
	     driver.findElement(By.id("ap_password_check")).sendKeys("rajib1234");
	     
	     // re sending password
	     
	     driver.findElement(By.id("continue")).click();
	     // click on continue button
	     

		

	}

}
