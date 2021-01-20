package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03c_CSS_Using_class {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  	
		  //basic syntax 
		  //.class

		  driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("alam11");
	}

}
