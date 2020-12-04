package String;

public class Program_06j_String_if_else {

	public static void main(String[] args) {
		
		String s1 = " Dhaka";
		String alam =  new StringBuffer(s1).reverse().toString();
		
		System.out.println(alam);
		
		String s2 = "Hi";
		
		if(s1.equals(s2)){
			
			System.out.println("They are equal");
			
		}else {
			
			System.out.println("Not equal");
			
			
		
		}
		

	}



}


