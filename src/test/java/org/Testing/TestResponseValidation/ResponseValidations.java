package org.Testing.TestResponseValidation;

import org.testng.Assert;

import io.restassured.response.Response;

public class ResponseValidations {
	
	
	public void ResponseValidation(Response Res) {
		System.out.println(Res.getStatusLine());
		System.out.println(Res.asString());
	}
	
	
	public static void ResponseStatusCodeVal(int ExpStatCode, Response Res) {
		Assert.assertEquals(Res.getStatusCode(), ExpStatCode);
	}
	
	public static void ResponseDataValid(int ExpData, String ActualData) {
		Assert.assertEquals(ActualData, ExpData);
	}

}
