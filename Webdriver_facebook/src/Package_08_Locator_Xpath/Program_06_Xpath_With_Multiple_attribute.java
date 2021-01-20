package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06_Xpath_With_Multiple_attribute {

	public static void main(String[] args) {

     	// xpath with multiple attribute

	   // Basic Syntax
		
		//tagnmae[@attribute='value'and @attribute='value']
		
		    System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com/");
			
			
			driver.findElement(By.xpath("//input[@name='pass'and @id='pass']")).sendKeys("1234");
			
				
		
		
		

	}

}
