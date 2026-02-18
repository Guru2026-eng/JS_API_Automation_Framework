package com.api.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest2 {
	
	@Test(description ="Check login API is working....")
	public void loginTest() {
		
		Response res = given().baseUri("http://64.227.160.186:8080")
				.header("Content-Type","application/json")
				.body("{\r\n"+ "  \"username\": \"Guru@2026\",\r\n"+ "\"password\": \"Guru@2026\"\r\n"+ "}")
				.post("api/auth/login");
		
		
		
		System.out.println(res.asPrettyString());
		
	}

}
