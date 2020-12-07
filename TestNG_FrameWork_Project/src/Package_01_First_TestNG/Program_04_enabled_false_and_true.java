package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Program_04_enabled_false_and_true {
 
	 @BeforeClass
	  public void beforeClass() {
		 
		System.out.println( " Open the Application"); 
	  }
	 
		@Test
		  public void Yahoo() {
				System.out.println("This is code _1");
		  }
		//enable false dile seta execute korbe na
		
		 // ami ekhne ture dile anra seta execute korbe
			@Test(enabled=false)
			  public void gmail() {
				
				System.out.println("This is code _2");
			  }
			 
			@Test
			  public void google() {
				
				System.out.println(" This is code _3");
			  }
			 
	 

 
  @AfterClass
  public void afterClass() {
	
	  System.out.println(" Closed the Application");
	  
  }

}
