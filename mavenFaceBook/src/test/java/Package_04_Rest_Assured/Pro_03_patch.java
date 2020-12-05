package Package_04_Rest_Assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_03_patch {
	
	//  patch means update
	public void patch() {
		

		JSONObject request = new JSONObject();
	     
	     
	     request.put("lastname", " Sarwar");
	    
	    
	    baseURI = "http://httplocalhost.info/3000";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
        header("content type", " application/json").
		
		body(request.toJSONString()).when().
	
		post("/users/4").
		then().
		statusCode(200).
		log().all();
		
		 
	
		
	}

}
