package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description = "Verify forgot password API working fine..!")
	public void testForgotPasswordAPI() {
		
		AuthService service = new AuthService();
		
		Response response = service.forgotPassword("umbarkargurudatta@gmail.com");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusCode());
		
		
	}

}
