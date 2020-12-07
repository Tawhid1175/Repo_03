package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Program_06a_groups_Test {
	// amra jei jei Test gulu lagbe for smoke testing
	// se guluke group e niye jabo
	// smoke testing holo implementation jawar ace main main functionality gulu test kore dekha
	//  than  se gulu Execute korar jnno ekta xml file create korte hobe
	// xml file e 4 ta main tag thakbe , 1:suite name, 2: test, 3:classes and 4:class 
	 @BeforeMethod
	  public void OpenApplication() {
		 
		 System.out.println(" Open the application");
	  }

	
  @Test
  public void rajib () {
	  
	  System.out.println(" RajibChowdhoury is Famaous Hero");
  }
  
  @Test(groups= {"smoke"})
  public void alam () {
	  
	  System.out.println(" alam is Layer");
  }
  
  @Test
  public void alam1 () {
	  
	  System.out.println(" alam is Layer");
  }
  
  @Test
  public void alam2 () {
	  
	  System.out.println(" alam is Layer");
  }
  
  
  
  @Test(groups= {"smoke"})
  public void dada() {
	  
	  System.out.println(" dada is IT Engr of Bank of America");
  }
 
  @AfterMethod
  public void ClosedApplication() {
	  
	  System.out.println(" Closed the application");
  }

}
