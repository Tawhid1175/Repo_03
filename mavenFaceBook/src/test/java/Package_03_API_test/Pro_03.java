package Package_03_API_test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class Pro_03 {  
	
	// Post  means create
	// logall

		@Test
		 public void Post() {
			
			JSONObject request = new JSONObject();
		     
		     request.put("name", "alam");
		     
		     request.put("job", " IT");
		     
		     System.out.println(request);
				
				System.out.println(request.toJSONString());	
				
			
			given().body(request.toJSONString()).header("content type", " application/json").
			
			contentType(ContentType.JSON).
			
			when().
			post("https://reqres.in/api/users").
			then().
			statusCode(200).
			log().all();
			
			 
		}	
			
			
	
	

}
