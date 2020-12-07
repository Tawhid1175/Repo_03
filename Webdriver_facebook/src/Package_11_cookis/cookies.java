package Package_11_cookis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		  
		  driver.manage().window().maximize();
		  
		  
		  driver.manage ().getCookies (); 
		  
		  
		  
		  /*
	        	  driver.manage ().getCookies (); =Return The List of all Cookies.  
				  driver.manage().getCookieNamed(arg0);  =Return specific cookie according to name  
				  driver.manage().addCookie(arg0);   =Create and add the cookie  
				  driver.manage().deleteCookie(arg0);  =Delete specific cookie  
				  driver.manage().deleteCookieNamed(arg0);  =Delete specific cookie according Name  
				  driver.manage().deleteAllCookies();  =Delete all cookies  
 
		*/
		
		

	}

}
