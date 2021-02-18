package Package_02_Data_xl;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class pro_0_practic {
	
	  WebDriver driver;
	  XSSFWorkbook wk;
	  XSSFSheet sit;
	  XSSFCell ce;
	 @BeforeMethod
	  public void beforeMethod() {
		 
		    System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	   
	        driver.manage().window().maximize();
		 
	  }
	
	
	
  @Test
  public void f() throws IOException, InterruptedException {
	  
	  File src = new File("C:/xl_data/MY-xl_data.xlsx");
	  
	  FileInputStream  fil = new FileInputStream(src);
	  
	   wk = new  XSSFWorkbook(fil);
	  
	   sit = wk.getSheetAt(1);
	  
	   for ( int i = 1; i <=sit.getLastRowNum(); i ++) {
		   
		 ce = sit.getRow(i).getCell(0); 
		   
		  ce.setCellType(CellType.STRING); 
		  
		  driver.findElement(By.id("email")).clear();
		  driver.findElement(By.id("email")).sendKeys(ce.getStringCellValue());
		  Thread.sleep(1000);
		  
		   ce= sit.getRow(i).getCell(1);
		  ce.setCellType(CellType.STRING);  
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("pass")).clear();
		  driver.findElement(By.id("pass")).sendKeys(ce.getStringCellValue());
		
		 
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		  Thread.sleep(1000);
		  
		  driver.navigate().back();
		  Thread.sleep(5000);
	  
		  
		   
	   }
	  
	  
	  
	  
  }
 
  @AfterMethod
  public void afterMethod() {
  }

}
