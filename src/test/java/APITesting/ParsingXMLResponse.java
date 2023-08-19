package APITesting;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import java.util.List;

public class ParsingXMLResponse {
	
	
//	@Test
//	void XMLResponse() {
//		
//		
//		
//		given()
//		
//		
//		.when()
//				.get("http://restapi.adequateshop.com/api/Traveler?Page=1")
//		
//		
//		.then()
//				.statusCode(200)
//				.header("Content-Type", "applications/xml; charset=utf-8")
//				//.body("TravellerinformationResponse.Page", equalTo("1"));
//	}
	
	
	//Approach 2
	
	
	void XMLResponseBody() {
		
		Response res = 
				
				given()
				
				.when()
				
					.get("http://restapi.adequateshop.com/api/Traveler?Page=1");
				
				XmlPath xmlobj = new XmlPath(res.asString());
				
			List<String> travellers = 	xmlobj.getList(DEFAULT_BODY_ROOT_PATH);
			
			
			Assert.assertEquals(travellers.size(),10);
				
	}
	
	
	
	
	
	
	
	
	
	

}
