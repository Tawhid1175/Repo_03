package int_reverse;

public class Integer_ReverSe {

	public static void main(String[] args) {
		
		// integer sorasori reverse kora jai nai, integer k age string niye jete hobe
		// than oi String k reverse korbo
		int reverse = 56789;
		
		String y = String.valueOf(reverse);
		
		String z = new StringBuffer(y).reverse().toString();
		
		System.out.println(z);
		
		

	}

}
