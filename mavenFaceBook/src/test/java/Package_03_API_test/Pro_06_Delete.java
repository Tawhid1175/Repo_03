package Package_03_API_test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;

public class Pro_06_Delete {
	
	@Test
	 public void delete() {
		

		given().
		
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
			
		
		
		
		
		
		 
		
	}
}