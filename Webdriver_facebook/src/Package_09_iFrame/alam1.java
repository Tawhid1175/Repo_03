package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alam1 {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
			
			driver.manage().window().maximize();
			
			
		  WebElement iframe_one = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		  driver.switchTo().frame(iframe_one);
		  driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		  Thread.sleep(1000);
		  driver.switchTo().defaultContent();
		  
		  WebElement frame_two = driver.findElement(By.xpath("//frame[@src='allclasses-frame.html']"));

		  driver.switchTo().frame(frame_two);
		  driver.findElement(By.linkText("CompoundMutator")).click();
		  Thread.sleep(1000);
		  
		  driver.switchTo().defaultContent();
		  
		  WebElement frame_three = driver.findElement(By.xpath("//frame[@title='Package, class and interface descriptions']"));
		  driver.switchTo().frame(frame_three);
		  driver.findElement(By.linkText("ScriptMutator")).click();
	}

}