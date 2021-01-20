package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_08_mouseHoverOver {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  
		  driver.manage().window().maximize();
		  
		  //hoverOver mane mouse take upore niye bosanu,click korbe na
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  driver.findElement(By.id("btnLogin")).click();

		  Thread.sleep(5000);
		  
		  WebElement PIM = driver.findElement(By.xpath("//b[text()='PIM']"));
		  
		  WebElement Configuration  = driver.findElement(By.id("menu_pim_Configuration"));
		 
		   WebElement Customer_field = driver.findElement(By.id("menu_pim_listCustomFields"));
		  
	      Actions act = new Actions(driver);
		  
		  act.moveToElement(PIM).moveToElement(Configuration).moveToElement(Customer_field).build().perform();
		  
		  
		  // xpath text_method
		  //b[text()='PIM'
	}

}
