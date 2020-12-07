package Package_09_iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_iFrame01 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("http://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			
			
	   	  driver.findElement(By.linkText("Iframe with in an Iframe")).click();

           Thread.sleep(3000);
		 
	      WebElement iFrame_One = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
          driver.switchTo().frame(iFrame_One);
	      
          Thread.sleep(3000);
          
	     WebElement iFrame_two = driver.findElement(By.xpath("( //iframe[@src='SingleFrame.html'])[1]"));
	     driver.switchTo().frame(iFrame_two);
	     
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("alam");
	     
}
}