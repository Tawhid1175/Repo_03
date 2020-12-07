package Package_02_Cigna;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_02_navigate_new_tab {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.cigna.com/");
	   
		  Actions act = new Actions(driver);

		  String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  driver.findElement(By.linkText("Dental Insurance Plans")).sendKeys(tab);
	}

}
