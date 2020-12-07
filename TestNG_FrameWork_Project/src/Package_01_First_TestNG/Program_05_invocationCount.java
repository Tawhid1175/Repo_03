package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Program_05_invocationCount {
	
	// amder kono test bar bar ba 10 time Test korte hoy tokhn
			// invocationCount diye jotho bar korte hobe oi sonkha ta dile hobe
			
	
	 @BeforeClass
	  public void beforeClass() {
		 
		 System.out.println(" Open the Application");
	  }
	
		@Test(invocationCount=10)
		
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
