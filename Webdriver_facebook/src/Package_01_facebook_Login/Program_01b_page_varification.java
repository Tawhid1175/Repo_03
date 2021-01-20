package Package_01_facebook_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01b_page_varification {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		 
		 String url = driver.getCurrentUrl();
		    
		 System.out.println(url);
		
		
		String act_title =driver.getTitle();
		System.out.println(act_title);
		
		String expected_title = "Facebook - Log In or Sign Up";
		
		if (act_title.equals(expected_title)){
			
			System.out.println("Test Pass");
		}else {
			
			System.out.println("Test failed");
			
		}

	}

}
