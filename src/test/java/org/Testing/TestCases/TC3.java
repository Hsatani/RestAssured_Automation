package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.Testing.TestResponseValidation.ResponseValidations;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;

import io.restassured.response.Response;

public class TC3 {

	public void testcase3() throws IOException {
		
		
        Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredTesting/Env.properties");
		
		
		HttpMethods http = new  HttpMethods(Pr);
		String id = "2999";
		Response Res = http.DeleteRequest(id, "QA_URI1");
		
		ResponseValidations.ResponseStatusCodeVal(200, Res);

	}

}
