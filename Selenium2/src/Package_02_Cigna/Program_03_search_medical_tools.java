package Package_02_Cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_search_medical_tools {

	public static void main(String[] args) {
		
		
		    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.cigna.com/");
	   

	        driver.findElement(By.id("search-desktop")).sendKeys("tools");
	}

}
