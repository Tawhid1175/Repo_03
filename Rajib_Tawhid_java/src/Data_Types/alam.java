package Data_Types;

import java.util.Scanner;

public class alam {
	
	

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println(" plz enter the number" );
		
		int mark = sc.nextInt();
		
		if ( mark< 100 && mark>90) {
			
			System.out.println(" student got GPA 5");
		} else if ( mark< 89 && mark> 80) {
			
			System.out.println(" student got a plus");
		}else {
			
			System.out.println(" student got failed");
		}
		
    
	}

}
