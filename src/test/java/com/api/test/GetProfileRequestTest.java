package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileManagementResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {

	@Test(description = "verify get user profile API working Fine .....!")
	public void getUserProfile() {
		
		AuthService service = new AuthService();
		Response response = service.loginAPI(new LoginRequest("Guru@2026", "Guru@2620"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		loginResponse.getToken();
		
		UserProfileManagementService upms = new UserProfileManagementService();
		response = upms.getProfile(loginResponse.getToken());

		UserProfileManagementResponse userProfileManagementResponse=response.as(UserProfileManagementResponse.class);
		System.out.println(userProfileManagementResponse.getFirstName());
		
		System.out.println(response.asPrettyString());
		
		
	}
}
