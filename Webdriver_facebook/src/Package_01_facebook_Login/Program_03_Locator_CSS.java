package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_Locator_CSS {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com");
        
        
        
        //CSS basic structure
        // "tagname[attribute='value']"
        
      driver.findElement(By.cssSelector("input[name='email']")).sendKeys("alam@gamil.com");
        


	}

}
