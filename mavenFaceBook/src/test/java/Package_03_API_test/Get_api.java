package Package_03_API_test;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_api {
	
	@Test
	public void rest() {
		
		Response response =	RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		
		System.out.println(response.getBody());
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.getStatusLine());
		
		
	}
	

}
