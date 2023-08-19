package org.Testing.TestSteps;

import java.util.Properties;

import org.Testing.Payloads.POJOBodyData;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HttpMethods {
	
	
	static Properties Pr;
	public HttpMethods(Properties pr) {
		this.Pr = pr;
	}
	
	public Response GetRequest(String URI) {
		
		Response Res = 
				given()
					.contentType(ContentType.JSON)
					.when()
					.get(Pr.getProperty(URI));
		
		return Res;
	}

	
     public Response PostRequest(POJOBodyData Body,String URI) {
		
		Response Res = 
				given()
					.contentType(ContentType.JSON)
					.body(Body)
					.when()
					.post(Pr.getProperty(URI));
		
		return Res;
	}
     
     
 	
     public Response DeleteRequest(String id,String URI) {
    	 
    	 String finalUri = (String) Pr.getProperty(URI)+"/"+id;
		
		Response Res = 
				given()
					.contentType(ContentType.JSON)
					.when()
					.delete(finalUri);
		
		return Res;
	} 
}
