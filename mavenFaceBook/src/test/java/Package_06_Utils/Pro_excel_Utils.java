package Package_06_Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pro_excel_Utils {
	
	public static void main(String[] args) {
		getRowCount();
	}
	
	
	public static void  getCellData() {
		String excelPath = "./API_Data_excel/Test data Excel Workssheets.xlsx";
		
	
		XSSFWorkbook Wk;
		try {
			Wk = new XSSFWorkbook(excelPath);
		} catch (IOException e) {
			
		}
		
		
		
		
	}
	
	
	public static  void getRowCount() {
		
	 String projdir= System.getProperty("User.dir");
		System.out.println(projdir);
		
		String excelPath = "./API_Data_excel/Test data Excel Workssheets.xlsx";
		
		try {
			XSSFWorkbook Wk = new XSSFWorkbook(excelPath);
			
			XSSFSheet sit = Wk.getSheet("Sheet1");
			
			 int  rowCount = sit.getPhysicalNumberOfRows();
			
			 System.out.println(" number of rows" +rowCount);
			
			
		} catch (Exception exp) {
			
		System.out.println(exp.getMessage());	
		System.out.println(exp.getCause());	
		exp.printStackTrace();
		}
		
	}

}
