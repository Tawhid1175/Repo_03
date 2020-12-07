package Package_01_facebook_Login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program_06_window_handel_Tabs_ArrayList {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
        
		 driver.findElement(By.linkText("Data Policy")).click();
		 
		 ArrayList <String>tabs = new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(tabs.get(1));
		 
		 driver.findElement(By.name("websubmit")).click();
		 
		// driver.findElement(By.id("email"))
		 
	}

}
