package Package_01_First_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Program_01_First_TestNG_program {
 
	
	
	@BeforeMethod
	  public void launchingApplication() {
		System.out.println("Open application");
	  }
	
	@Test
    public void loginFB() {
   System.out.println("This Alom Bhai er Code1");
   
   System.out.println("This Alom Bhai er Code2");
   
   System.out.println("This Alom Bhai er Code3"); 
}


@AfterMethod
public void closingApplication() {
	  System.out.println(" Closing the application");
}

}
