package Package_01_facebook_Login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alam_day {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		   driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		  WebElement fram_one = driver.findElement(By.xpath("//iframe[@id='u_0_c']"));
		     driver.switchTo().frame(fram_one);
		      
		     driver.switchTo().defaultContent();
		      
		      WebElement fram_two = driver.findElement(By.xpath("//iframe[@id='u_0_d']"));
		    driver.switchTo().frame(fram_two);
		    Thread.sleep(1000);
		      
		     driver.switchTo().defaultContent();  
		      
		       
		       WebElement fram_three = driver.findElement(By.xpath("//div[@class='_8ien']"));
		       driver.switchTo().frame(fram_three);
		       driver.findElement(By.xpath("//img[contains(@id,'u_11_9')]")).click();
		      
		
      


	}

}
