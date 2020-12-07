package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_07_Single_click {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  
		  driver.manage().window().maximize();
		  
		  Actions act = new Actions(driver);
		  
		
		  WebElement Click_Me = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		 act.moveToElement(Click_Me).click().build().perform();  
	}

}
