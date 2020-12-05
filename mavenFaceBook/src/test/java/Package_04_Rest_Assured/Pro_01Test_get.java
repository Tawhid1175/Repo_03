package Package_04_Rest_Assured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
public class Pro_01Test_get {
	
	
	
	@Test
	public void get() {
		
	 baseURI = "http://httplocalhost.info/3000";
	

	given().param(" name", " automation").
	       get("/users").
	then().
	        statusCode(200).
	log().all();
	
		
	}
	
	
	
	

    
	
	
}
