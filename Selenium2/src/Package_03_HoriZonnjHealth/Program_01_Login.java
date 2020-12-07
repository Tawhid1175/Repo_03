package Package_03_HoriZonnjHealth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Login {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
			
	      WebDriver driver = new ChromeDriver();
	      
	      driver.get("https://www.horizonnjhealth.com/");
	   
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.linkText("MEMBER SIGN IN")).click();
		  
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("alam");

	}

}
     