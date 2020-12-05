package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class faccbook_Login {
	WebDriver driver;
	 @FindBy(id="email")
	 WebElement  Userid1;
	 
	 @FindBy(id="pass")
	 WebElement Userpassword1;
	 
	 @FindBy(name="login")
	 WebElement LoginButton;
	 
	 // ekhne amk class er name diye ekta constractor create korte hobe
	 
	 // Pagefactory  initialized the WebElement 
	 
	 // class object ke initialized kore Constructor
	 
	 public faccbook_Login( WebDriver driver){
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 void enterEmail1( String name ) {
		 Userid1.sendKeys(name);
		 
		 
	 }
	 
	 void passwordid1(String pas) {
		 
		 Userpassword1.sendKeys(pas);
		 
	 }
	 
	 void email1() {
		 LoginButton.click();
	 }
    
}
