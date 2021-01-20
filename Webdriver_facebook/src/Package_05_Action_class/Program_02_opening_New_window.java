package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_02_opening_New_window {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  driver.manage().window().maximize();
	
		  
		  //action holo ekta class
		  
		  //Selenium er keyboard abong mouse er kaj  kore Action
		  
		  // openging a new Window
		  
		  
		  
		  String currentwindo = driver.getWindowHandle();
		  System.out.println(currentwindo);
		  
		  Actions act = new Actions(driver);
		  
		
		  WebElement openwindow = driver .findElement(By.linkText("Forgot Password?"));
		  
		 act.keyDown(Keys.SHIFT).click(openwindow).build().perform();
		
		

	}

}
