package Package_03_API_test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

import static io.restassured.RestAssured.*;
import org.hamcrest.Matchers;

public class Pro_04_Post {

	// put means create

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
		statusCode(200);
		
		 
	
		
		
		
		
		//log().all();

		 
	 }


	

	

	
	
	
}
