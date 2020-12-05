package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alam_practic {
	WebDriver driver;
	
   @FindBy( id ="email")
    WebElement useremail;

   @FindBy(id = "pass")
   WebElement userpass;
   
   @FindBy( name ="login" )
	WebElement loginButton;
   
   
   
   
   public alam_practic(WebDriver driver) {
	   
	   this.driver= driver;
	   
	   PageFactory.initElements(driver, this);

}




void loginfacebook() {
	   
	   useremail.sendKeys("alam@yahoo.com");
	   userpass.sendKeys("1234");
	   loginButton.click();
	   
   }
	
	

}
