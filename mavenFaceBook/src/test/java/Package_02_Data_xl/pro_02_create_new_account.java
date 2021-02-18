package Package_02_Data_xl;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pro_02_create_new_account {
	
	 WebDriver driver;
	 XSSFWorkbook wb ;
	 XSSFSheet  shit;
	 XSSFCell ce;
	 
	@BeforeMethod
	public void initialstape() {
	
		     System.setProperty("webdriver.chrome.driver","C:\\MY Testing File\\Selenium\\Tools\\ChromeDriver\\chromedriver_win32/chromedriver.exe");
			
	        driver = new ChromeDriver();
	        driver.get("https://www.facebook.com");
	   
	        driver.manage().window().maximize();
		
		
	}
	
	 @Test
 public void xlTest() throws IOException, InterruptedException {
		 
		   driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
           Thread.sleep(1000);
           
		// to identify this xl file.....
		 
		 File src = new File("C:/xl_data/MY-xl_data.xlsx");
		 
		// Create fileinput stream to read xl........
		 
		 FileInputStream fis = new FileInputStream(src);
		 
		 // to access workbook
		  wb = new  XSSFWorkbook(fis);
		 
		 // to access Sheet
		  shit = wb.getSheetAt(0);
		
		for ( int i = 1; i<= shit.getLastRowNum(); i++) {
			 
	            ce =shit.getRow(i).getCell(0);
				ce.setCellType(CellType.STRING);
				
	            
	            //firstname field
	            driver.findElement(By.name("firstname")).clear();
	            driver.findElement(By.name("firstname")).sendKeys(ce.getStringCellValue());
	            Thread.sleep(1000);
	            
	            ce =shit.getRow(i).getCell(1);
				ce.setCellType(CellType.STRING);
				
	            
	            //lastname field
	            driver.findElement(By.name("lastname")).clear();
	            driver.findElement(By.name("lastname")).sendKeys(ce.getStringCellValue());
	            Thread.sleep(1000);
	            
	            ce =shit.getRow(i).getCell(2);
				ce.setCellType(CellType.STRING);
				
	            
	            //email field
	            driver.findElement(By.name("reg_email__")).clear();
	            driver.findElement(By.name("reg_email__")).sendKeys(ce.getStringCellValue());
	            Thread.sleep(1000);
	            
	            ce =shit.getRow(i).getCell(3);
				ce.setCellType(CellType.STRING);
				
	            
	            //password field
	            driver.findElement(By.name("reg_passwd__")).clear();
	            driver.findElement(By.name("reg_passwd__")).sendKeys(ce.getStringCellValue());
	            Thread.sleep(1000);
	            
	            ce =shit.getRow(i).getCell(4);
				ce.setCellType(CellType.STRING);
				
	            
	            //reset password
	            driver.findElement(By.name("reg_email_confirmation__")).clear();
	            driver.findElement(By.name("reg_email_confirmation__")).sendKeys(ce.getStringCellValue());
	            Thread.sleep(1000);
	            
	            
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
	          //  driver.findElement(By.name("websubmit")).click();
	          //  Thread.sleep(3000);
	            
	            driver.navigate().back();

	            Thread.sleep(8000);
		          
		          
	           
	           
	            
			
		}
		 
	 }
	 
	 
}
