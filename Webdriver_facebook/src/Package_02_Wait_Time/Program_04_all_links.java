package Package_02_Wait_Time;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04_all_links {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  
		  driver.navigate().to("https://www.facebook.com");
		  
       
		  
		  List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		  
		  System.out.println("total link = " + alllinks.size());
		  
		   for( WebElement e:alllinks) {
			   
			   System.out.println(e.getText());
		   }
	}

}
