package login.mavenFaceBook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Pro_04_Execute_new_fb_Account {
	 public WebDriver driver;
	 
	 @BeforeClass
	  public void beforeClass() {
		 
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
	      driver.manage().window().maximize();
		  
		 
	  }
	
  @Test
  public void f() throws InterruptedException {
	  
	  Pro_04_Create_FB_new_Account obj = new Pro_04_Create_FB_new_Account(driver);
	  obj.click_new_account_Button_1();
	  Thread.sleep(1000);
	  
	  obj.EnterUserFirstName_2("Mohammed");
	   Thread.sleep(1000); 
	   
	   obj.EnterUserlasttName_3("hossain");
	   Thread.sleep(1000); 
	   
	   obj.EnterUserEmailid_4("dada@yahoo.com");
	   Thread.sleep(1000); 
	   
	   obj.EnterUserPassWord_5("1234");
	   Thread.sleep(1000); 
	   obj.EnterUserRePassWord_6("1234");
	   obj.fbusermoth();
  }
 

  @AfterClass
  public void afterClass() {
  }

}
