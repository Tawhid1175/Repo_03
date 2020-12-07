package Package_Handle_Error;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_error_Handleing_By_Try_catch {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// error Handling
		// error handling 5 tecnicaqe kora jai
		// 1: throw 2: throws 3: Try 4:catch 5: finally
		
		// Try/catch kono error jeta holo known error
		// seta ke try catch diye handle kore next step e seje pari
		
		//  sei code ta run kortec na , ba korabo na, sei code to mark kore nite hobe than
		// right click kore Surround With e giye. Try/catch Block click korte hobe

		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  


		  driver.manage().window().maximize();
		
		  driver.findElement(By.id("email")).sendKeys("alam@gamil.com");
		  Thread.sleep(3000);
		  
		  try {
			driver.findElement(By.id("pass")).sendKeys("1234");
			  Thread.sleep(3000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}// souranding diye kora jai
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  

	}

}
