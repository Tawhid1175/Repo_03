package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_10_PopUp_alart_handelling {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  

	     driver.manage().window().maximize();
		  

 	 
	 
	 driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	
	 

	}

}
