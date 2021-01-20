package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Alam_Practice {
	
	@BeforeMethod
	  public void beforeMethod() {
		
		
	  }
	
	
	
  @Test(priority =1)
  public void alam() {
	
	  System.out.println(" alam is good boy");
	  
  }
  
  @Test(priority =3)
  public void dada() {
	
	  System.out.println(" dada is good boy");
	  
  }
  @Test( priority = 1)
  public void raj() {
	
	  System.out.println(" raj is good boy");
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
