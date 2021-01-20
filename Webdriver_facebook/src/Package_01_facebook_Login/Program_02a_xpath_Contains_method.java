package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02a_xpath_Contains_method {

	public static void main(String[] args) {
		
		
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		 //Basic Syntax
		  //// "//*[contains(@attribute,'value')]"
		  
		  driver.findElement(By.xpath("//*[contains(@class,'_58mt')]")).click();
		  

	}

}
