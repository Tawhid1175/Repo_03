package Package_03_Sending_Value_ArrayList_String;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ArrayListMultimap;

public class alam {

	

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://www.facebook.com");
		  
		 driver.manage().window().maximize();
		  
          String useremail = " taw, alam";
          
          String []emailid = useremail.split(",");
          String email =emailid[0].trim();
          String pass =emailid[1].trim();
          
          driver.findElement(By.id("email")).sendKeys(email);
          driver.findElement(By.id("pass")).sendKeys(pass);


	}

}
