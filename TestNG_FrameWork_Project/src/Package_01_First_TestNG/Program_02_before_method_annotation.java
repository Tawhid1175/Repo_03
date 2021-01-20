package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Program_02_before_method_annotation {
 static WebDriver driver;
	

@BeforeMethod
public void beforeMethod() {
	
	System.out.println(" Open the application");
	
	
	
}	
  @Test
  public void method1() {
	  
	  System.out.println(" This is my 1st code<<<<<<<<<<<<<<<<<< ");
	  
  }  
	  
 public void method2() {
	  
	  System.out.println(" This is my 2nd code.............................. ");
	  
  }  
 
 
 @Test
 public void email1() {
	  
	  System.out.println(" This is my 3rd code ");
	  
 }  
  
 @Test
 public void email2() {
	  
	  System.out.println(" This is my 4th code ");
	  
 }  
  
 

  @AfterMethod
  public void afterMethod() {
	  
	 System.out.println(" closed the application"); 
	  
  }


}
