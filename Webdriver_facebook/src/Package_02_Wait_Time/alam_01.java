package Package_02_Wait_Time;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam_01 {

	public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  Thread.sleep(1000);
		  driver.manage().window().maximize();
	
		   ArrayList<String> al = new ArrayList<String>( driver.getWindowHandles());
		   driver.switchTo().window(al.get(1));
		
		
		

	}

}
