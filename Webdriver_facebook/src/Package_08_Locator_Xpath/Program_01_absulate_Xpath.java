package Package_08_Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_01_absulate_Xpath {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        driver.manage().window().maximize();
        
        // root element  theke shuro kore target  element  porjoth amk dekhe jete hobe
        
        // beging to ending sob follow korte hoy
        
        
        // aabsulate xptha er sommossa holo dev time kono attribute ba value 
        // change korle absulate xpath r kaj kore na
        
        
        driver.findElement(By.xpath("(/html/body/div/div/div)[1]")).click();
        
        
        
		
		

	}

}
