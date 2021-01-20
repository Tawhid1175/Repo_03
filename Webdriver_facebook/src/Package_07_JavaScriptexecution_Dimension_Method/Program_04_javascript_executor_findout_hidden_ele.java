package Package_07_JavaScriptexecution_Dimension_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_javascript_executor_findout_hidden_ele {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://github.com/mozilla/geckodriver/releases");
		  
		  //javascriptexecutor aito holo interface
		  //interface e kono method thakbe na ,nijek likte hobe
		  // hidden element ke 
		  
		  // hidden element ghulu k dekhar jnno amra ai method ta use kori....
		  
		  driver.manage().window().maximize();
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		 // js.executeScript("scrollBy(0,5000)");
		  
		WebElement ele = driver.findElement(By.linkText("Browser Toolbox"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);

	}

}
