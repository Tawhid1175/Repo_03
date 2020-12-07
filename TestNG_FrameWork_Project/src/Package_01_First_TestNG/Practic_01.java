package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Practic_01 {
	
	 @BeforeMethod
	  public void beforeMethod() {
		 
		System.out.println(" Open the Application");
	  }
	
	
  @Test(invocationCount=10)
  public void email() {
	  System.out.println( " this is first program");
	  System.out.println( " this is first program");
	  System.out.println( " this is first program");
  }
 
  
  @Test( enabled=true)
  public void gmail() {
	  
	  System.out.println( " this is 2nd program");
	  System.out.println( " this is 2nd program");
	  System.out.println( " this is 2nd program");
  }
  
  
  @Test( groups = { " smokesuit"} )
  public void facebook() {
	  
	  System.out.println( " this is  facebook program");
	  System.out.println( " this is  facebook program");
	  System.out.println( " this is  facebook program");
  }
  @Test
  public void Yahoo() {
	  
	  System.out.println( " this is 3rd program");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" closed the Application");
  }

}
