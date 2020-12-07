package Package_11_cookis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		  
		  driver.manage().window().maximize();
		  
		// how can we find if an element is displayed on screen?
		  
	       driver.findElement(By.partialLinkText("Cookies")).isDisplayed();

	}

}
