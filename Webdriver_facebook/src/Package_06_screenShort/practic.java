package Package_06_screenShort;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic {



	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
	    driver.manage().window().maximize();
		
	    driver.findElement(By.id("email")).sendKeys("MD Tawhidul alam");
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	      File photo = ts.getScreenshotAs(OutputType.FILE);
	      
	      FileUtils.copyFile(photo, new File("./photo/chovi.png "));
	    
	    
	    
	    
		/*
    TakesScreenshot ts = ( TakesScreenshot) driver;
    
    File src = ts.getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(src, new File("./alamTawhid/se.png"));
    */
    
      
	}

}
