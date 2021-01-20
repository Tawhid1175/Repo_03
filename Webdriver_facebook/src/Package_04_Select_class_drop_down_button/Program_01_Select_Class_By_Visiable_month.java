package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_01_Select_Class_By_Visiable_month {

	public static void main(String[] args) {
		

		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		// Drop down button er jnno Select class use korte hobe
		  
		 
		  driver.findElement(By.id("u_0_2")).click();
		  
		  Select dd = new Select(driver.findElement(By.name("birthday_month")));
		  
		  // dd.selectByVisibleText("Jan");
		  
		   dd.selectByValue("11");
	}

}
