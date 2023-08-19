package APITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.json.JSONObject;

public class ParsingJSONResponse {
	
	
	
	//You can also ParseJSONResponse using JSONPath 
	
	
	    @Test
		void testJsonResponseBodyData() {
	    	//.body("x._embedded.products[3].name", equalTo("")
			Response res = 	
			       given()
			            .contentType(ContentType.JSON)
			       .when()
			             .get("http://localhost:8080/api/products");
			   
			JSONObject jo = new JSONObject(res.asString());
			   
			   boolean status = false;
			   
			   for(int i = 0; i< jo.getJSONArray("products").length(); i++) {
				   String BookTitle = jo.getJSONArray("products").getJSONObject(i).get("name").toString();
				   if( BookTitle.equals("JavaScript Cookbook")) {
					   status = true;
					   break;
				   }
			   }
			   Assert.assertEquals(status, true);			   
		}
}
