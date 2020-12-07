package Package_01_facebook_Login;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alam {

	private static final int ArrayList = 0;
	private static final int String = 0;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		ArrayList<String> al = new ArrayList<>(String);
		
		    al.add("alam");
		    al.add("alam2");
		    al.add("alam@yahoo.com");
		    al.add("alam@yahoo.com");
		    al.add("1234");
		    
		System.out.println("total size :" + al.size());
		
		String firstuser = al.get(0);
		String lastuser  = al.get(1);
		String email     = al.get(2);
		String Re_email  = al.get(3);
		String pw        =al.get(4);
		
		
		driver.findElement(By.name("firstname")).sendKeys(firstuser);
		driver.findElement(By.name("lastname")).sendKeys(lastuser);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(Re_email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(pw);
		
		
		/*driver.findElement(By.id("email")).sendKeys("alam@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("1234");
        driver.findElement(By.id("u_0_4")).clear();*/
	}

}
