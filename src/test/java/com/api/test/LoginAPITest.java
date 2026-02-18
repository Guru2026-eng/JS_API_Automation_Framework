package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest {
	
	@Test(description ="Check login API is working....")
	public void loginTest() {
		
		LoginRequest loginRequest = new LoginRequest("Guru@2026","Guru@2620");
		AuthService service = new AuthService();
		
		Response res = service.loginAPI(loginRequest);
		
		
		LoginResponse loginResponse = res.as(LoginResponse.class);
		System.out.println(res.asPrettyString());
		System.out.println(loginResponse.getToken());
		
	}

}
