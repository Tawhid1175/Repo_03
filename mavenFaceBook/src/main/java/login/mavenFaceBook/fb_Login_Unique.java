package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_Login_Unique {
	
	 WebDriver driver;
	 
	 @FindBy(id="email")
	 WebElement  Userid1;
	 
	 @FindBy(id="pass")
	 WebElement Userpassword1;
	 
	 @FindBy(name="login")
	 WebElement LoginButton;
	 
	 
	 public fb_Login_Unique(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
		
	}


 
	 void enterUserEmailAndPassword() {
		 
		 Userid1.sendKeys("alam@yahoo.com");
	     
		 Userpassword1.sendKeys("1234");
		 
		 LoginButton.click();
		 
		 
	 }
	 


   
	

}
