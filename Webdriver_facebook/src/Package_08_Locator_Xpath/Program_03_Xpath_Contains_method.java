package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_03_Xpath_Contains_method {

	public static void main(String[] args) {
		
		

		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  //  contains method amra use kori jodi attribute er value alfa newmoric thake
		  // tar mane jetar value change hoye jai , tokhn amra contains method use kori
		  
		  // amra contains method user kore vlue change holei xptha kaj kore
		  
		  // ekhne  * o use korte pari  abr tagnmane o use korte pari// * mane sob
		  
		 //Basic Syntax
		  //input[contains(@class,'_58mt')]"
		  //// "//*[contains(@class,'_58mt')]"
		  
		  driver.findElement(By.xpath("//*[contains(@class,'_58mt')]")).click();
		  
		

	}

}
