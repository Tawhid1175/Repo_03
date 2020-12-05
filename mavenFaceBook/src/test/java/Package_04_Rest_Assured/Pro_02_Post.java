package Package_04_Rest_Assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Pro_02_Post {
	
	@Test
	public void post() {
		

		JSONObject request = new JSONObject();
	     
		 request.put("Firstname", " Tom");
	     request.put("lastname", " driver");
	     request.put(" subject", 1);
	    
	    baseURI = "http://httplocalhost.info/3000";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
        header("content type", " application/json").
		
		body(request.toJSONString()).when().
	
		post("/users").
		then().
		statusCode(200).
		log().all();
		
		 
		 }	 
		
		
		
	
	

}
