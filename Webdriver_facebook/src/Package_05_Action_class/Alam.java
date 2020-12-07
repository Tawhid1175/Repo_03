package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alam {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://jqueryui.com/slider/ ");
		  driver.manage().window().maximize();
		  
           Actions act = new Actions(driver);
		  

		  String tab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		  
		  driver.findElement(By.linkText("Forgot account?")).sendKeys(tab);
		  
		



	}

}
