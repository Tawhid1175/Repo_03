package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02_relational_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        
        
        /* basic structure of xpath 
          "//tagname[@attribute='value']" */
        
     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("alam@gmail.com");
     driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
	 driver.findElement(By.xpath("//input[@value='Log In']")).click();



	}

}
