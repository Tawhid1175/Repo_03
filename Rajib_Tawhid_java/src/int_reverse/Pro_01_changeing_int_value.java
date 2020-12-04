package int_reverse;

public class Pro_01_changeing_int_value {

	public static void main(String[] args) {
		
		
		int a = 400;
		
		int b = 600;
		
		System.out.println(" value of a before swaping" + a );
		System.out.println(" value of a before swaping" + b );
		
		int temp;
		temp = a ;
		a = b;
		b = temp;
		
		System.out.println(" value of a after swaping" + a );
		System.out.println(" value of a  after swaping" + b );
		

	}

}
