package Package_03_API_test;

import org.testng.annotations.Test;

import net.minidev.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Pr0_08_Put {
	
	@Test
	public void put_update() {
		
		
		
		 JSONObject request = new JSONObject();
	     
	     request.put("name", "alam");
	     
	     request.put("job", " IT");
	     
	     System.out.println(request);
			
		System.out.println(request.toJSONString());	
			
		
		
	}
	
	

}
