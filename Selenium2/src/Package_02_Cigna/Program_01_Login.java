package Package_02_Cigna;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Login {

	public static void main(String[] args) {
		
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.cigna.com/");
	        
	       
		driver.findElement(By.xpath("(//a[@class='btn btn-sm btn-primary'])[2]")).click();
		
	    ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));

		driver.findElement(By.id("username")).sendKeys("alam");
		
		driver.findElement(By.id("password")).sendKeys("1234");
		
		driver.findElement(By.id("loginbutton")).click();
	}

}
