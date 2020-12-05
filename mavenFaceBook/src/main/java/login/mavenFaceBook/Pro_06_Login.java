package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pro_06_Login {
	WebDriver driver;
	@FindBy(id="email")
	WebElement useremailid;
	
	@FindBy(id="pass")
	WebElement userpas;
	

	@FindBy(name ="login")
    WebElement loginButton;
	
	 public Pro_06_Login(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	void fblogin() {
		useremailid.sendKeys("alam@yahoo.com");	
		userpas.sendKeys("1234");
		loginButton.click();
		
	}
	
	

}
