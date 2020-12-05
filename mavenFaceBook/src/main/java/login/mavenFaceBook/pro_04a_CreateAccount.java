package login.mavenFaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pro_04a_CreateAccount {
	
	 WebDriver driver;
	@FindBy(xpath ="//a[@data-testid='open-registration-form-button']")
	WebElement CreateNewAccountButton;
	
	@FindBy(name="firstname")
	WebElement Userfirstname;
	
	@FindBy(name="lastname")
	WebElement Userlastname;
	
	@FindBy(name="reg_email__")
	WebElement UserEmailid;
	
	
	@FindBy(name="reg_passwd__")
	WebElement UserPassword;
	
	@FindBy(name="reg_email_confirmation__")
	
	WebElement UserRePassword;
	
	@FindBy(id ="month")
	WebElement usermonth;
	
	@FindBy(id ="day")
	WebElement userday;
	
	@FindBy(id ="year")
	WebElement useryear;
	
	public pro_04a_CreateAccount(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void CreateNewAccountMethod() {
		
		 CreateNewAccountButton.click();
		 
		 Userfirstname.sendKeys("tawhid");
		 Userlastname.sendKeys("alam");
		 UserEmailid.sendKeys("alam@yahoo.com");
		 UserPassword.sendKeys("1234");
		 UserRePassword.sendKeys("1234");
		 
		 Select mm = new Select(usermonth);
		 mm.selectByVisibleText("Jan");
		 
		 Select dd = new Select(userday);
		 dd.selectByVisibleText("22");
		 
		 Select yy = new Select(useryear);
		 yy.selectByVisibleText("1987");
	}
	
	

}
