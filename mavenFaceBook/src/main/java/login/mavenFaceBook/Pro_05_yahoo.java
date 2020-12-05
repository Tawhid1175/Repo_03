package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pro_05_yahoo {
	WebDriver driver;
	  @FindBy(id="createacc")
	  WebElement registration;
	  
	  @FindBy(id="usernamereg-firstName")
	  WebElement userfirstname;
	  
	  @FindBy(id="usernamereg-lastName")
	  WebElement userlastname;
	  
	  @FindBy(id="usernamereg-yid")
	  WebElement emailid;
	  
	  @FindBy(id="usernamereg-password")
	  WebElement userpasword;
	  
	  @FindBy(id="usernamereg-phone")
	  WebElement userphone;
	  
 public Pro_05_yahoo(WebDriver driver) {
	 
	 this.driver =driver;
		
		PageFactory.initElements(driver, this); 
 }
 
 void  userRegis1() {
	 registration.click();
	  
 }
 
 void  firstname2() {

	 userfirstname.sendKeys("alam");
	  
 }
 
 void lastname3() {
	
	 userlastname.sendKeys("taw");
 }
 
 void useremail4() {
	 emailid.sendKeys("alamtaw"); 
 }
 
 void password5() {
	 userpasword.sendKeys("12345"); 
 }
 
 void phonenew6() {
	 userpasword.sendKeys(" 01815292919"); 
 }
 
 
}
