package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_09_sliding_function {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://jqueryui.com/slider/");
		   
		  driver.manage().window().maximize();
		  
		  
		  // slide ek pas thek onno pase nite ,jodi dekha jai je 
		  // program run korce na tokhn  mone  korte hobe , oi ta frame under
		  // tai swithto().frame diye oi ta korte hoy.....
		  
		 driver.switchTo().frame(0);
		  
		 Actions act = new Actions(driver);
		 
		 WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 
		 act.dragAndDropBy(slide, 400, 0).build().perform();

		
		    
        
        

		  
	}

}
