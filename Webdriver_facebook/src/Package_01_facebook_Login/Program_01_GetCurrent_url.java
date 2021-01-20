package Package_01_facebook_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_GetCurrent_url {

	public static void main( String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String Act_title =driver.getTitle();
        System.out.println("Act_title");
        
			//maximize page//
		
		driver.manage().window().maximize();
		
        driver.findElement(By.id("email")).sendKeys("Alam@yahoo.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		 
		
		
		
	}
}
