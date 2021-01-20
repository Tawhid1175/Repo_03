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
		
		
	   System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
	    driver.manage().window().maximize();
		
	    driver.findElement(By.id("email")).sendKeys("MD Tawhidul alam");
	    
	      TakesScreenshot ts = (TakesScreenshot) driver;
	      
	      File shot = ts.getScreenshotAs(OutputType.FILE);
	      
	      
	      FileUtils.copyFile(shot, new File("./facebook/alam.png"));
	        
	        System.out.println(" screenshot taken by MD ALMA");
	    
	    
	    
	    
	    
		/*
    TakesScreenshot ts = ( TakesScreenshot) driver;
    
    File src = ts.getScreenshotAs(OutputType.FILE);
    
    FileUtils.copyFile(src, new File("./alamTawhid/se.png"));
    */
    
      
	}

}
