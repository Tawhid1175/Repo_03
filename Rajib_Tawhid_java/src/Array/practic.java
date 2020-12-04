package Array;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practic {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
       String Current_page = driver.getCurrentUrl();
         System.out.println(Current_page);
         
         String Current_title = driver.getTitle();
         
         System.out.println(Current_title);

       String Act_title= " Facebook - Log In or Sign Up";
       
       if (Current_title.equals(Act_title)) {
    	   
    	   System.out.println("Test pass");
       }else {
    	   
    	   System.out.println(" Test failed");
       }
       
       

}
}