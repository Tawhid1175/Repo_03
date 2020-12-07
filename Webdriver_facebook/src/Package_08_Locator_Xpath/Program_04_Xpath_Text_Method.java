package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_Xpath_Text_Method {

	public static void main(String[] args) throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  //hoverOver mane mouse take upore niye bosanu,click korbe na
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();

		  Thread.sleep(5000);
		  
		  WebElement PIM = driver.findElement(By.xpath("//b[text()='PIM']"));
		  
		
		  // Basis Syntax of Xpath Text Method
		
		  //tagname[text()='Visible Text']
	}

}
