package Data_Types;

import java.util.Scanner;

public class FindingGreading {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner( System.in);
		
		int mark = reader.nextInt();
		
		if ( mark <= 100 && mark >=90) {
			
		System.out.println(" student got A+");
		
		}else if (mark <= 89 && mark >= 80) {
			
			System.out.println(" student got A");
		}else {
			
			System.out.println("studern got failed");
		}
		

	}

}
