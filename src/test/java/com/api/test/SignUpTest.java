package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.model.request.SignUpRequest;

import io.restassured.response.Response;

public class SignUpTest {
	
	@Test(description="Test account creation - sign up request API working fine")
	public void signUpTest(){
		SignUpRequest signUpRequest =  new SignUpRequest.Builder().username("abc@123")
		.email("abc123@gmail.com")
		.firstName("abc123")
		.lastName("xyz567")
		.password("abc@2026")
		.mobileNumber("8979878787").build();
		
		AuthService service = new AuthService();
		Response response = service.signUp(signUpRequest);
		
		System.out.println(response.asPrettyString());
		
		//Assert.assertEquals(response.asPrettyString(), "User registered successfully!");
		
	}
	{
		
	}

}
