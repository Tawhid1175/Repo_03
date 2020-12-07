package Package_07_Dim_Method_Scriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05_sending_value_without_sendkeys {

	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  JavascriptExecutor js =( JavascriptExecutor) driver;
		  js.executeScript("document.getElementById('email').value=1234");
		  
     
	}

}
