package Package_06_screenShort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parogram_01_ScreenShot {



	

	public static void main(String[] args) throws IOException {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		 
		  driver.findElement(By.id("email")).sendKeys("MD TAWHIDUL ALAM");
		  
		      TakesScreenshot ts = ( TakesScreenshot) driver;
		      
		 File src =     ts.getScreenshotAs(OutputType.FILE);
		 
        FileUtils.copyFile(src, new File("./screenshot/sorce.pnt" ));
          

	}

}
