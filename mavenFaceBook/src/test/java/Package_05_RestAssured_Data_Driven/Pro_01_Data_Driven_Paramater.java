package Package_05_RestAssured_Data_Driven;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;




public class Pro_01_Data_Driven_Paramater {
	
	@DataProvider(name = "dataForPost")
	public Object [] [] dataForPost() {
		
		Object [] [] data = new Object[2][3];
		
		
	
		data[1][1] ="Tawhid23";
		data[1][2] ="alam";
		data[1][3] = 2;
		
		data[2][1] ="dada50";
		data[2][2] ="dadavai";
		data[2][3] = 1;
		
		return data;
		
		
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


