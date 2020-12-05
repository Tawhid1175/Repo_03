package Package_03_API_test;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_08_Json_patch_update {
	
	
	public void patch_Update() {
		

		JSONObject request = new JSONObject();
	     
	     
	     request.put("lastname", " driver");
	    request.put(" subject", 1);
	    
	    String besturl = "https://localhost.3000/";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
        header("content type", " application/json").
		
		body(request.toJSONString()).when().
	
		patch("/users/4").
		then().
		statusCode(200).
		log().all();
		
		 
	
		
		
	}

}
