package Package_03_API_test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Pro_10_Json_delete {
	
	@Test
	public void Delete() {
		
		
given().
		
		when().
		delete("https://reqres.in/api/users/2").
		then().
		statusCode(200).
		log().all();
	}
	

}
