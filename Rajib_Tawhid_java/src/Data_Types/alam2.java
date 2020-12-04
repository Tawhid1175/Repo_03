package Data_Types;

import java.io.InputStream;
import java.util.Scanner;

public class alam2 {

	public static void main(String[] args) {
		

   Scanner sc =  new Scanner(System.in);
   
   
   System.out.println(" enter the number");

   int mark = sc.nextInt();
   
   if  (mark < 100 && mark >90) {
	   
	   System.out.println("  Student got  a plus = A+");
   } else if ( mark < 89 && mark > 80 ) {
	   
	   System.out.println(" Student got a great ");
   } else {
	   
	System.out.println(" Student got failed");   
   }
	


	}

}
