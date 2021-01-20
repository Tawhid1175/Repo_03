package Package_07_JavaScriptexecution_Dimension_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06_alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  
		  driver.manage().window().maximize();
		  
		  // popup
		  // application launch korar por sei yes or no ase setake popup handling  bole
         // alert handing korak popup bole  
		  
	     driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  
		  Thread.sleep(5000);
		  driver.switchTo().alert().accept();
		  
		 // driver.switchTo().alert().dismiss();
	}

}
