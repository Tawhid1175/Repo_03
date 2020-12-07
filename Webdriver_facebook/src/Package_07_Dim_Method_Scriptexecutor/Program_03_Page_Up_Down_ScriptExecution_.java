package Package_07_Dim_Method_Scriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_Page_Up_Down_ScriptExecution_ {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  //page up and down kora , sob page dekha
		  
		  
		  driver.manage().window().maximize();
		  
         JavascriptExecutor js =  (JavascriptExecutor)driver; 
    
          js.executeScript("scrollBy(0,5000)");

	}

}
