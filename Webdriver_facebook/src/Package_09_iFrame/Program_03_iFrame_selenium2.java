package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_iFrame_selenium2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
			
			driver.manage().window().maximize();
			
			
			WebElement frame_one = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
			driver.switchTo().frame(frame_one);
			driver.findElement(By.linkText("com.thoughtworks.selenium.condition")).click();
            Thread.sleep(3000);
            
            driver.switchTo().defaultContent();
            
            
            WebElement frame_two = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
            driver.switchTo().frame(frame_two);
            driver.findElement(By.linkText("ConditionRunner.Context")).click();
            Thread.sleep(3000);
            
           driver.switchTo().defaultContent();
            
           WebElement frame_three = driver.findElement(By.xpath("//frame[@name='classFrame']"));
           driver.switchTo().frame(frame_three);
           driver.findElement(By.linkText("ConditionRunner")).click();
           Thread.sleep(3000);
           
           driver.findElement(By.linkText("JUnit4AndTestNgConditionRunner")).click();
           Thread.sleep(3000);
           
           driver.findElement(By.linkText("com.thoughtworks.selenium.condition.DefaultConditionRunner")).click();
	}

}
