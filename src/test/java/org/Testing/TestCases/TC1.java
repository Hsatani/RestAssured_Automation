package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.Testing.TestResponseValidation.ResponseValidations;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;

import io.restassured.response.Response;

public class TC1 {
		
		
		public void testcase1() throws IOException {
			
			System.out.println("Now I am executing TC1 and will get records based upon Id from TestCase 2");
			
			Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredTesting/Env.properties");
			
			HttpMethods http = new  HttpMethods(Pr);
			Response Res = http.GetRequest("QA_URI2");
			
			ResponseValidations.ResponseStatusCodeVal(200, Res);
			
			System.out.println("The Posted Json Data is fetched and it is:" + Res.asString());
		}
		
		
	
}
