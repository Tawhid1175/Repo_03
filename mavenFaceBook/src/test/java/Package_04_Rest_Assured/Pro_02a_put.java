package Package_04_Rest_Assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_02a_put {
	@Test
	public void put() {
	
	JSONObject request = new JSONObject();
    
	 request.put("firstname", " Faisal");
    request.put("lastname", " Advocate");
   request.put(" subject", 1);
   
   baseURI = "http://httplocalhost.info/3000";
	
	given().
	contentType(ContentType.JSON).
	accept(ContentType.JSON).
   header("content type", " application/json").
	
	body(request.toJSONString()).when().

	put("/users").
	             then().
	statusCode(200).
	log().all();
	
	}
}
