package Package_04_Rest_Assured;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_04_delete {
	
	
	@Test
	public void test_delete() {
	
	
   baseURI = "http://httplocalhost.info/3000";
	
	given().
	
	when().
	
	delete("/users/4").
	             then().
	statusCode(200);
	
	}
}
