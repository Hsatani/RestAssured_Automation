package org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import org.Testing.Payloads.POJOBodyData;
import org.Testing.Payloads.POJOSimpleBody;
import org.Testing.TestResponseValidation.ResponseValidations;
import org.Testing.TestSteps.HttpMethods;
import org.Testing.TestUtilities.PropertiesFileLoad;

import io.restassured.response.Response;

public class TC2 {

	public void testcase2() throws IOException  {
		
		

		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredTesting/Env.properties");
		
		POJOBodyData Body = POJOSimpleBody.GetBodyData();
		
		HttpMethods http = new  HttpMethods(Pr);
		Response Res = http.PostRequest(Body, "QA_URI1");
		
		ResponseValidations.ResponseStatusCodeVal(200, Res);
		

	}

}
