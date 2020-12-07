package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Program_09_Priorty_Test {
	
	 @BeforeMethod
	  public void OpenApplication() {
		 
		 System.out.println(" Open the application");
	  }
	
  @Test(priority =1)
  public void bmw() {
	  
	  System.out.println(" this is bmw");
  }
  
  @Test(priority =2)
  public void honda() {
	  
	  System.out.println(" this is honda");
  }
  
  @Test(priority=3)
  public void audi () {
	  
	  System.out.println(" this is audi");
  }
  
  @Test(priority = 4)
  public void tasla() {
	  
	  System.out.println(" this is tasla");
  }
  
  @Test(priority =5)
  public void toyta() {
	  
	  System.out.println(" this is toyta");
  }
 

  @AfterMethod
  public void afterMethod() {
  }

}
