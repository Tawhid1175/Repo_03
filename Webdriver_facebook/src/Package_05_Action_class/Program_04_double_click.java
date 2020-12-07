package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_04_double_click {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://testautomationpractice.blogspot.com/");
		  
		
  
        Actions act = new Actions(driver);
        
        WebElement double_click= driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
          
       
        act.doubleClick(double_click).build().perform();
	}

}   // act.moveElement(small).click().contax.sendend.build.performed
