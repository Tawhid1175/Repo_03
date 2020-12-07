package Package_03_Sending_Value_ArrayList_String;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_Sending_Value_By_ArrayList {

	public static void main(String[] args) {
		
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\ChromeBrowser\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("https://www.facebook.com");
		  
		  driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
		  
		  ArrayList<String> al = new ArrayList<String>();
		  
		  al.add("alam");
		  al.add("Tawhid");
		  al.add("alam@gmail.com");
		  al.add("1234");
		  
		  System.out.println(al.size());
		  
		  
		  String firstuser = al.get(0);
		  String lastuser  = al.get(1);
		  String emailid   = al.get(2);
		  String pw        = al.get(3);
		  
		  
		  driver.findElement(By.name("firstname")).sendKeys(firstuser);
		  
		  driver.findElement(By.name("lastname")).sendKeys(lastuser);
		  
		  driver.findElement(By.name("reg_email__")).sendKeys(emailid);
		  
		  driver.findElement(By.name("reg_passwd__")).sendKeys(pw);

	}

}
