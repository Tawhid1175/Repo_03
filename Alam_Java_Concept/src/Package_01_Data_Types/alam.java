package Package_01_Data_Types;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alam {

	public static void main(String[] args) {
		
        System.setProperty(" webdriver.gecko.driver", "C:\\MY Testing File\\Selenium\\Tools\\geckodriver\\geckodriver-v0.28.0-win64\\geckodriver-v0.28.0-win32/geckodriver");
		 
		 WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");
		
		
	}

}
