package Package_03_API_test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_07_Json {
	
	@Test
	public void JSon() {
		
		JSONObject request = new JSONObject();
	     
	     request.put("firstname", "dada");
	     
	     request.put("job", " driver");
	    request.put(" subject", 1);
	    
	    String besturl = "https://localhost.3000/";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
        header("content type", " application/json").
		
		body(request.toJSONString()).when().
	
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
		
		 
	
		
		
	}

}
