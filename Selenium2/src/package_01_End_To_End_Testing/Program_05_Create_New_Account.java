package package_01_End_To_End_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_05_Create_New_Account {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver","C:\\\\Selenium\\\\ChromeBrowser\\\\chromedriver_win32/chromedriver.exe");
			
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	   
	        driver.manage().window().maximize();
		
	      //create a new account
	        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
            Thread.sleep(3000);
            
            //firstname field
            driver.findElement(By.name("firstname")).sendKeys("Tawhiddul");
            Thread.sleep(3000);
            
            //lastname field
            driver.findElement(By.name("lastname")).sendKeys("alam");
            Thread.sleep(3000);
            
            //email field
            driver.findElement(By.name("reg_email__")).sendKeys("ala@gamil.com");
            Thread.sleep(3000);
            
            //password field
            driver.findElement(By.name("reg_passwd__")).sendKeys("1234");
            Thread.sleep(3000);
            
            //reset password
            driver.findElement(By.name("reg_email_confirmation__")).sendKeys("1234");
            Thread.sleep(3000);
            
           // drop downlist , select the month by using select class
            
            Select mm = new Select(driver.findElement(By.id("month")));
            mm.selectByVisibleText("Jan");
            Thread.sleep(3000);
            
            // Select the day
            Select dd = new Select(driver.findElement(By.id("day")));
            dd.selectByVisibleText("24");
            Thread.sleep(3000);
           
            
            // Select the year
            Select yy = new Select(driver.findElement(By.id("year")));
            yy.selectByVisibleText("1987");
            Thread.sleep(3000);
            
            //Click the Radio button
            driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
            Thread.sleep(3000);
            
            // click on sign up button
            driver.findElement(By.name("websubmit")).click();
            Thread.sleep(3000);
           
           
            
	}

}
