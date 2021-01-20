package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_iFram {

	public static void main(String[] args) throws InterruptedException {
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/");
			
			driver.manage().window().maximize();
			
	       WebElement iFrame_one = driver.findElement(By.xpath("//frame[@name='packageListFrame']"));

           driver.switchTo().frame(iFrame_one);
		   driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven")).click();
		   Thread.sleep(3000);
		   
		   driver.switchTo().defaultContent();
		   
		   WebElement iFrame_two = driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		   driver.switchTo().frame(iFrame_two);
		   driver.findElement(By.linkText("ScriptMutator")).click();
		   Thread.sleep(3000);
		   
		   driver.switchTo().defaultContent();
		   
		   WebElement iFram_three = driver.findElement(By.xpath("//frame[@name='classFrame']"));
		   driver.switchTo().frame(iFram_three);
		   driver.findElement(By.linkText("CompoundMutator")).click();
		   Thread.sleep(3000);
		   
		   driver.findElement(By.linkText("ScriptMutator")).click();
	}

}
