package Package_05_if_else;

public class pro_01_if_else_parallam {

	public static void main(String[] args) {
		
		// aita amra cross browser test korar somoy lagbe
		// ekhne Firefox dibe firefox print korbe
		// cross browser test abong parallal test er jnno er ta lagbe
	
		  String browser = "chrome_browser";
		  
		  if ( browser.equals("chrome_browser")) {
			  
			  System.out.println(" enter my code in chrome browser");
		  }
		  else if ( browser.equals("Firefox")) {
			  
			  System.out.println(" enter my code in Firefox browser");
	  
		  }
		  
  else if ( browser.equals("Internet_Explorer")) {
			  
			  System.out.println(" enter my code in Internet_Explorer browser");
	  
		  }else {
			  
			  System.out.println( " just correct your code");
		  }

	}

}
