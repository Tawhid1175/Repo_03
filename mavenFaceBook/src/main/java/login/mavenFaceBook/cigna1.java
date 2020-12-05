package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cigna1 {
	
	WebDriver driver;
	
	 @FindBy(xpath ="//a[@cignabutton='primary']")
	 WebElement finddoctor;
	 
	 @FindBy(xpath ="(//button[@class='search-button'])[1]")
	 WebElement medicare;

	 @FindBy(xpath="//button[@data-dismiss='modal']")
	 WebElement covit19;

	
	 
	 public cigna1(WebDriver driver) {
    	 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 void findDoctor1() {
		 finddoctor.click(); 
	 }
	 
	void medicare2() {
		
		medicare.click();
	}
void covit19Button()	{
	covit19.click();
}
}
