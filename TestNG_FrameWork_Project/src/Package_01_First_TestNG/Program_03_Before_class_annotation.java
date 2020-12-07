package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Program_03_Before_class_annotation {
 
	 @BeforeClass
	  public void beforeClass() {
		 
		 System.out.println("Open the application");
	  }	
	
	// ekhne prothome open hobe  than Test gulu execute korte  tarpor closed kirbe
	
	@Test
  public void Yahoo() {
		System.out.println("This is code _1");
  }
 
	@Test
	  public void gmail() {
		
		System.out.println("This is code _2");
	  }
	 
	@Test
	  public void google() {
		
		System.out.println(" This is code _3");
	  }
	 

  @AfterClass
  public void afterClass() {
	  
	  System.out.println(" closed the application");
  }

}
