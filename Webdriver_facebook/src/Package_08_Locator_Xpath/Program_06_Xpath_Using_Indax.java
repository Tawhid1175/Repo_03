package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06_Xpath_Using_Indax {

	public static void main(String[] args) {
		
		
		    System.setProperty("webdriver.chrome.driver", "C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.navigate().to("https://www.facebook.com/");
			
			// same attribute jodi different element e thake seketre 
			// amra indax use kore numbering kore dibo...
			
			
			driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
			
			
		//	validation of Xpath

		//	xpath findout korar ekta sutro ace

		//	there are two way to validate xpath


			//1: a)First Way -
		//	DOM stracture e giye xpath likey Control F dile amk nice ekta edit fild dibe sekhane cheek korete pari or


		//	b) Console e giye $x("xpath") like validation korte pari
			 

			// $x("(//input[@name='sex'])[3]")


			//  CSS Validation

		//	$(" CSS")
			

	}

}
