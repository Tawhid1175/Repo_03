package Package_05_RestAssured_Data_Driven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Pro_04_delete_02 {
	
	
	@DataProvider(name= "DataForDelete" )
	public Object [] DataForDelete() {
	
		return new Object[] {
			4,5,6,7	
		};
		}
	
	// parameters comes from testng xml
	
	@Parameters(" userId")
	@Test(dataProvider = "DataForDelete")
	public void test_delete( int userid) {
	
	System.out.println(" value of userid :" + userid);
   baseURI = "http://httplocalhost.info/3000";
	
	given().
	
	when().
	
	delete("/users/4"+userid).
	             then().
	statusCode(200);
	
	
	}	


}
