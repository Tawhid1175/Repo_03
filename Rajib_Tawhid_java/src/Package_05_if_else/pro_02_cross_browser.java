package Package_05_if_else;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro_02_cross_browser {

	public static void main(String[] args) {
		
		// aita amra cross browser test korar somoy lagbe
				// ekhne Firefox dibe firefox print korbe
				// cross browser test abong parallal test er jnno er ta lagbe
			
				  String browser = "chrome_browser"; // Firefox dile Firefox e jabe
				  
				  if ( browser.equals("chrome_browser")) {
					  

	
						System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
						WebDriver driver = new ChromeDriver();
						driver.get("https://www.facebook.com/");
						driver.manage().window().maximize();
						
					System.out.println(" enter my code in chrome browser");

				  }
				  else if ( browser.equals("Firefox")) {
					  
					  System.out.println(" enter my code in Firefox browser");
			  
				  }
				  
		  else if ( browser.equals("Internet_Explorer")) {
					  
					  System.out.println(" enter my code in Internet_Explorer browser");
			  
				  }else {
					  
					  System.out.println( " just correct your code");
				  }

			}

		


	}


