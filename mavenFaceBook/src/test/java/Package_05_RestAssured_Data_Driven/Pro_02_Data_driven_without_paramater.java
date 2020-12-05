package Package_05_RestAssured_Data_Driven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Pro_02_Data_driven_without_paramater {
	
	
	
	
	@DataProvider(name = "dataForPost")
	public Object [] [] dataForPost() {
		
		return new Object [] [] {
			
			{ " faisal", " nun", 1},
			
			{ " Sarwar", " Jaman", 2}
			
		};
		
		
		
		
		
	}
	// parametar
	@Test(dataProvider = "dataForPost")
	public void post( String firstname,String lastname, int subjectId) {
		

		JSONObject request = new JSONObject( );
	     
		 request.put("firstname", firstname);
	     request.put("lastname", lastname);
	     request.put(" subject", subjectId);
	    
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
