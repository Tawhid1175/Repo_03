package Create_object_difference_way;

public class alam {
	
	public void myclass( ) {
		
		int a = 10;
		int b = 20;
		
		int c = a + b;
		
		System.out.println(c);
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		alam al = alam.class.newInstance();
		al.myclass();
    
    
	}

}
