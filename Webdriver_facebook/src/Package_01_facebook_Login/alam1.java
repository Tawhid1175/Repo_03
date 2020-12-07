package Package_01_facebook_Login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class alam1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cigna.com/");
		
		driver.manage().window().maximize();
		
		 String Current_window = driver.getCurrentUrl();
		 
		
  
		/* @FindBy(xpath="(//a[@rel='noopener noreferrer'])[2]")
	     WebElement LoginCigna;
	    
		// @FindBy(id=" username")
	    @FindBy(xpath = "//input[@name='username']")
	    WebElement userfirstname;
	    
	    @FindBy(xpath ="//input[@id='password']")
	    WebElement userpassword;
	    
	    @FindBy(xpath ="//input[@id='loginbutton']")
	    WebElement LoginButton;
*/
	}

}
