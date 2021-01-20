package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam_0 {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
			
			driver.manage().window().maximize();
			
			 driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
			 
			 Thread.sleep(1000);
			 driver.findElement(By.linkText("ChromeDriver")).click();
			 
			 Thread.sleep(1000);
			 
			 driver.findElement(By.linkText("org.openqa.selenium.remote.RemoteWebDriver")).click();
			 
			 
			
			
			
			
		    

}
}