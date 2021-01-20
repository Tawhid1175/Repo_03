package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_06_Right_Click {

	public static void main(String[] args) {
		
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  
		  driver.manage().window().maximize();
		  
		  Actions act = new Actions(driver);
		  
	   	WebElement Click_Me = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		  
		  act.moveToElement(Click_Me).contextClick().build().perform();
		  
		  
		  //button[@onclick='myFunction()']
		//  <button onclick="myFunction()">Click Me</button>

		  
	}

}
