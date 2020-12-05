package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginfb {
	static  WebDriver driver;
	
	@FindBy(id ="email")
    WebElement useremailfield;
	
	@FindBy(id ="pass")
	WebElement userpassword;
	
	@FindBy(name ="login")
    WebElement loginButton;
	
	 public Loginfb(WebDriver driver){
		 this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 // constractor ghulik define kore dite hobe
	 



	void enteremailid( ) {
		 
		 useremailfield.sendKeys(" alam@");
	 }
	 
 void enterpass() {
		 
	 userpassword.sendKeys("1234");
	 }
 
    void click_login() {
    	
    	loginButton.click();
    }
}
