package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05_Starts_With_Method {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
		
		
		// Starts-With Method diye amr partial value diye test korte pari

  
        // basic Syntax 
        
        //tagname[starts-with(@attribute,'value')]
        
        
        driver.findElement(By.xpath("//input[starts-with(@id,'ema')]")).sendKeys("Tawhid@gamil.com");
        
        
	}

}
