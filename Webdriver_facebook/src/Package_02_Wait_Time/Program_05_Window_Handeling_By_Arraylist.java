package Package_02_Wait_Time;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05_Window_Handeling_By_Arraylist {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
        
		 driver.findElement(By.linkText("Pages")).click();
		 
		 ArrayList <String>tabs = new ArrayList<String>(driver.getWindowHandles());
         driver.switchTo().window(tabs.get(0));
		 
        driver.findElement(By.linkText("Games")).click();
		 
		 	
		
		
		
		

	}

}
