package Package_04_Select_class_drop_down_button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_03_Select_Class_By_VisiableTest_year {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		//Drop down button er jnno Select class use korte hobe
		
		  driver.findElement(By.id("u_0_2")).click();
		
		Select dd = new Select(driver.findElement(By.id("day")));
		
			 dd.selectByVisibleText("10");
				
	
			Select cc = new Select(driver.findElement(By.id("year")));
			
			cc.selectByVisibleText("1986");
 
		
		
		
	}

}
