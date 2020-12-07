package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class alam2 {

	 @BeforeMethod
	  public void beforeMethod() {
		 
		 System.out.println(" open the application");
	  }


	
	
	
  @Test(enabled = false)
  public void login () {
	System.out.println(" alam");  
	  
  }
  
  @Test( groups ="smokesuite")
  public void logino () {
	System.out.println(" launching the application");  
	  
  }
  
  
  @Test( priority =1)
  public void logino3 () {
	System.out.println(" launching the application");  
	  
  }
 
  
  @Test(invocationCount = 10)
  public void login1 () {
	System.out.println(" Rajib");  
	  
  }
  
  @Test
  public void login2 () {
	System.out.println(" launching the application");  
	  
  }
 
 
   @AfterMethod
  public void afterMethod() {
  }

}
