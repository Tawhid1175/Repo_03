package Package_05_Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program_03_Drag_and_drop {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		  
		  // keyboard er mouse  ke ek jaiga theke onno jaiga te niye  dragandDrop use kori
		  
		   Actions act = new Actions(driver);
		   
           WebElement source_item = driver.findElement(By.id("box4"));
		  
		   WebElement target_ele = driver.findElement(By.id("box104"));
		   
		   act.dragAndDrop(source_item, target_ele).build().perform(); ;
		   
	}

}
