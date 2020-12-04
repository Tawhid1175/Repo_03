package Create_object_difference_way;

public class alam2 {
	
	public void my() {

	int a = 100;
	int b = 20;
	
	int c = a + b;
	
	System.out.println( " Sum of a and b + c" + c );
	
	}
	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		
		alam2 al = alam2.class.newInstance();
		al.my();
		
		

	}

}
