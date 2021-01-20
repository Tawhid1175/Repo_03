package Package_03_Sending_Value_ArrayList_String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02_Sending_value_By_String {



	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  
		          String firstid = " alam, Tawhid";
                  String[] first = firstid.split(",");
                  String firstuse = first[0].trim();
                  String lastuser = first[1].trim();
                  
                  driver.findElement(By.id("email")).sendKeys(firstuse);
        		  
        		  driver.findElement(By.id("pass")).sendKeys(lastuser);
        		  
                  
	} 

}
