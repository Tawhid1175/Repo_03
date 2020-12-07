package Package_07_Dim_Method_Scriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Quit_and_Closed_method {

	public static void main(String[] args) throws InterruptedException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  // jotho gulo tab open ace  ta close korar method
		  
		Thread.sleep(5000);
		
     String tabopen = Keys.chord(Keys.CONTROL, Keys.ENTER);
     
     driver.findElement(By.linkText("Forgot account?")).sendKeys(tabopen);
     
     Thread.sleep(5000);
     
    driver.quit();
     
   // driver.close();
	}

}
