package Package_01a_if_else_MY;

import java.util.Scanner;

public class Program_08_if_else_even_odd_User_given_number {

	public static void main(String[] args) {
		
		
	        	// aita holo user given number
		
				// 2 diye vhag kore jodi 0 hoy tahole seta even 
				// onnotai Odd
				
		        Scanner sc = new Scanner ( System.in);
				 
				 System.out.println(" plz enter a number");
				
		      int number = sc.nextInt();
		      
		      if ( number % 2 ==0) {
		    	  
		    	  System.out.println( " Number is even");
		      } else {
		    	  
		    	  System.out.println( " Number is odd");
		      }
		      


	}

}
