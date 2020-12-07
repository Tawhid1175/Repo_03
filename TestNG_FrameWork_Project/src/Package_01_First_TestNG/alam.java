package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class alam {
	
	 @BeforeClass
	  public void LaunchingApplication() {
		 System.out.println( "ama.............");
	  }
	
	
  @Test(groups = "smoketest")
  public void dada1() {
	  System.out.println("dada is alo");
  }
  
  
  @Test(enabled = false)
  public void dada() {
	  System.out.println("dada is alo");
  }
  
  @Test(invocationCount = 10)
  public void dada5() {
	  System.out.println("dada is alo");
  }
  
  @Test(enabled = false)
  public void dada2() {
	
	  System.out.println("rajib is ");
	  
  }
  
  @Test(invocationCount =10)
  public void dada3() {
	  System.out.println("alam......");
  }
  
  @Test
  public void dada4() {
	  System.out.println("taw...........");
  }
 

  @AfterClass
  public void afterClass() {
  }

}
