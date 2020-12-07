package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
			
			driver.manage().window().maximize();

			    WebElement frame_one = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
	            driver.switchTo().frame(frame_one);
				driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		        Thread.sleep(3000);
		        
		        driver.switchTo().defaultContent();
		        
		         WebElement second = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		         driver.switchTo().frame(second);
		        driver.findElement(By.linkText("CommandProcessor")).click();
                Thread.sleep(3000);
                
                driver.switchTo().defaultContent();
                
             WebElement third = driver.findElement(By.xpath("//frame[@name='classFrame']"));
             driver.switchTo().frame(third);
                
             driver.findElement(By.linkText("WebDriverCommandProcessor")).click();

	}

}
