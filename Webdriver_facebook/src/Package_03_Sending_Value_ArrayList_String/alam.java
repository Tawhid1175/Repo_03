package Package_03_Sending_Value_ArrayList_String;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ArrayListMultimap;

public class alam {

	

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		  String alam = " hmm, tahhh";
		  
		
          
          
          
         // driver.findElement(By.id("email")).sendKeys(ala);
       //   driver.findElement(By.id("pass")).sendKeys(ta);


	}

}
