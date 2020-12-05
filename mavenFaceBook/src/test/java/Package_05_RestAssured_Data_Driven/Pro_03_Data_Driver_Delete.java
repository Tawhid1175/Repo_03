package Package_05_RestAssured_Data_Driven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Pro_03_Data_Driver_Delete {
	
	@DataProvider(name= "DataForDelete" )
	public Object [] DataForDelete() {
	
		return new Object[] {
			4,5,6,7	
		};
		}
	
	
	
	
	@Test(dataProvider = "DataForDelete")
	public void test_delete( int userid) {
	
	
   baseURI = "http://httplocalhost.info/3000";
	
	given().
	
	when().
	
	delete("/users/4"+userid).
	             then().
	statusCode(200);
	
	
	}	

}
