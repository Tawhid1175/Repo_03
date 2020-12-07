package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_05_Testing_Sign_Up_button {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		
		  
       driver.findElement(By.name("websubmit")).click();
	}

}
