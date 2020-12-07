package Package_07_Dim_Method_Scriptexecutor;


import java.awt.geom.Dimension2D;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_02_dim_window_manage {

	public static void main(String[] args) {


		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		 // window Customize, page k size kore newa 
		  
		  // page k control kora, Page take icceh motho size kora
		  
	   	  System.out.println(driver.manage().window().getSize());
		  
		  Dimension dim = new Dimension(300,400);
		  
		  driver.manage().window().setSize(dim);
		  
		  // amr application er page size age koth chilo, r ekhn ami kotho size dilm..
		  
		  System.out.println(driver.manage().window().getSize());



}
}