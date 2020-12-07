package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Program_06_groups_somke_suit_test {
	
	// jodi smoke suit korte hoy 
    // amra  jodi ekta group run korte cai tahole 
	// smoke test holo implementation e jawar age main main funtionality 
	// guli test kore dekha 
	
	 @BeforeClass
	  public void beforeClass() {
		 
		 System.out.println("Open the application");
	  }
	
		@Test( groups ={"Smoke Suit"})
		
	  public void Yahoo() {
				System.out.println("  email Id field");
				
				System.out.println( " password field");
				
				System.out.println("  Lognin");
		  }
		 
			@Test(enabled= false)
			  public void gmail() {
				
				System.out.println("This is code _2");
			  }
			 
			@Test(enabled=false)
			  public void google() {
				
				System.out.println(" This is code _3");
			  }
			 
	


  @AfterClass
  public void afterClass() {
	  System.out.println(" closed the Application");
  }

}
