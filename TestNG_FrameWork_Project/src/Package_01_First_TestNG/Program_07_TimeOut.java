package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Program_07_TimeOut {
	
	// amra caile ekta test teke onno test e jawar jnno time fixed kore dite pari timeOut method diye
	
	@BeforeClass
	  public void beforeClass() {
	  }
	
	@Test(timeOut=3000)
	
	  public void Yahoo() {
			System.out.println("This is code _1");
	  }
	 
		@Test(timeOut=3000)
		  public void gmail() {
			
			System.out.println("This is code _2");
		  }
		 
		@Test( timeOut=3000)
		  public void google() {
			
			System.out.println(" This is code _3");
		  }



  @AfterClass
  public void afterClass() {
	  
	  System.out.println("closed the Application");
  }

}
