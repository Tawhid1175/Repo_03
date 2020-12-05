package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pro_01_logingfb {
	
	WebDriver driver;
	
	@FindBy(id= "email")
WebElement useremailid;

	@FindBy(id= "pass")
WebElement userpass;
	
	@FindBy(name ="login")
    WebElement loginButton;
	

  public pro_01_logingfb(WebDriver driver) {
		
	  
	  this.driver=driver;
	  
	  PageFactory.initElements(driver, this);
	}


public void alam() {
	  
	  
	  useremailid.sendKeys("alam@yahoo.com");
	  
	  userpass.sendKeys("1234");
	  
	  loginButton.click();
  }
	
	
	
	
}
