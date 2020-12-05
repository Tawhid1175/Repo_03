package login.mavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pro_04_Create_FB_new_Account {
	
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
	
	

	public  Pro_04_Create_FB_new_Account( WebDriver driver) {
		
		this.driver =driver;
		
		PageFactory.initElements(driver, this);
		
	}

  public void click_new_account_Button_1() {
    	 CreateNewAccountButton.click(); 
    	 
     }
     
  public   void EnterUserFirstName_2( String firstnam) {
    	 Userfirstname.sendKeys(firstnam);
     }
     
  public   void EnterUserlasttName_3( String lastnam) {
    	 Userlastname.sendKeys(lastnam);
     }
     
     
  public   void EnterUserEmailid_4( String useremil) {
    	 UserEmailid.sendKeys(useremil);
     }
     
   public  void EnterUserPassWord_5( String Userpass) {
    	 UserPassword.sendKeys(Userpass);
     }
     
     
   public  void EnterUserRePassWord_6( String UserRepass) {
    	 UserRePassword.sendKeys(UserRepass);
     }
     
  public   void fbusermoth() {
    	 Select mm = new Select(usermonth);
    	 mm.selectByVisibleText("Jan");
     }
     
   public  void fbuserday() {
    	 Select dd = new Select(userday);
    	 dd.selectByVisibleText("22");
     }
     
   public   void fbuseryear() {
    	 Select dd = new Select(useryear);
    	 dd.selectByVisibleText("1988");
     }
}
