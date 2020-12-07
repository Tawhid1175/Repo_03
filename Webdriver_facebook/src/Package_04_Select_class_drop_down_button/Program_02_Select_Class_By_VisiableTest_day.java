package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_02_Select_Class_By_VisiableTest_day {

	public static void main(String[] args) {
		
		


		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.findElement(By.id("u_0_2")).click();
		  
		  Select dd = new Select(driver.findElement(By.id("day")));
		  
		  dd.selectByVisibleText("20");
		  
		  // dd.selectByValue("24");
	}

}
