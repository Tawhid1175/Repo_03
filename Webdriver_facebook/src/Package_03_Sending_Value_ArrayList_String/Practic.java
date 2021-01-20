package Package_03_Sending_Value_ArrayList_String;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practic {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");

		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.manage().window().maximize();
		  
		 // driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]")).click();
		  
		    
		  ArrayList<String> al = new ArrayList<String>();
		  
		  al.add("alam");
		  al.add("taw");
		  
		  String alam =al.get(0);
		  
		  String taw =al.get(1);
		  
		  
		    
		    
		    
		    driver.findElement(By.id("email")).sendKeys(alam);
           
		    driver.findElement(By.id("pass")).sendKeys(taw);
	}

}
