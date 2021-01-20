package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_05_Small_to_Capital_letter {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  Actions act = new  Actions( driver);

		  WebElement emailfiled = driver.findElement(By.id("email"));
		    
		  act.moveToElement(emailfiled).keyDown(Keys.SHIFT).sendKeys("tawhid").build().perform();
		  
	}

}
