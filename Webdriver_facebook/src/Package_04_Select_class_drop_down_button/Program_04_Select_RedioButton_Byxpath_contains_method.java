package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_04_Select_RedioButton_Byxpath_contains_method {

	public static void main(String[] args) {
		

		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		 //Basic Syntax
		  //// "//*[contains(@class,'_58mt')]"
		  
		  driver.findElement(By.xpath("//*[contains(@class,'_58mt')]")).click();
		  
	}  

}
