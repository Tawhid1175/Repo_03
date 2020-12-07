package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_03_Buy_a_Product {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.amazon.com/");
	   
	      driver.manage().window().maximize();
	      
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11 max pro");
		
		Thread.sleep(5000);
		
		WebElement Buy = driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		
		 WebElement Buy1 = driver.findElement(By.xpath("//body[contains(@class,'a-m-us a-aui_72554-c a-aui_control_group_273125-c a-aui_dropdown_274033-c a-aui_link_rel_noreferrer_noopener_274172-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_preload_261698-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate')]"));
		
		// Buy_now2 = driver.findElement(By.id("centerCol"));
		 
		 //  WebElement Card_butten = driver.findElement(By.id("add-to-cart-button"));
		 
		 
       Actions act = new Actions(driver);
	     
	     act.moveToElement(Buy).moveToElement(Buy1).click().build().perform();
		
	     
	    
	  // WebElement Buy1 = driver.findElement(By.linkText("Samsung Galaxy S9, 64GB, Midnight Black - For AT&T / T-Mobile (Renewed)"));
		
      
	}

}
