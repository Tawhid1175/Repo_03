package Package_03_API_test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_05_patch {
	
	// patch means Update

		@Test
		 public void alam() {
			
			JSONObject request = new JSONObject();
		     
		     request.put("name", "alam");
		     
		     request.put("job", " IT");
		     
		     System.out.println(request);
				
				System.out.println(request.toJSONString());	
				
			
			given().body(request.toJSONString()).header("content type", " application/json").
			
			contentType(ContentType.JSON).
			
			when().
			patch("https://reqres.in/api/users/2").
			then().
			statusCode(200).
			log().all();
			
			 
		
			
		}		

}
