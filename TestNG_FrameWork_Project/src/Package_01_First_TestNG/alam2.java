package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class alam2 {

	 @BeforeMethod
	  public void beforeMethod() {
		 
		 System.out.println(" open the application");
	  }


@Test
public void alam1() {
	
	System.out.println(" alam is good boy");
}


@Test
public void dada() {
	
	System.out.println(" dada is good boy");
}

@Test
public void rajib() {
	
	System.out.println(" rajib is good boy");
}






	

   @AfterMethod
  public void afterMethod() {
  }

}
