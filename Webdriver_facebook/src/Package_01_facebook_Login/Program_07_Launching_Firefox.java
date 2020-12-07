package Package_01_facebook_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_07_Launching_Firefox {

	public static void main(String[] args) {
		 
		
	  System.setProperty("webdriver.gecko.driver", "C:\\MY Testing File\\Selenium\\Tools\\geckodriver\\geckodriver-v0.28.0-win64/geckoDriver.exe");	
		
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  
	  
	  
	/*  Write codes to launch Chrome, Firefox, and IE browser?  
			  Answer: 
			  Chrome: System.setProperty("Webdriver.chrome.driver" "FilePath")  
			                 WebDriver driver= new ChromeDriver();  
			  Firefox: System.setProperty("Webdriver.gecko.driver" "FilePath")  
			                WebDriver driver= new FirefoxDriver();  
			  Internet Explorer:  System.setProperty("Webdriver.ie.driver" "FilePath")  
			                 WebDriver driver= new InternetExplorerDriver(); 
			   
*/
	}

}
