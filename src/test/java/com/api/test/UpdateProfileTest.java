package com.api.test;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.model.request.LoginRequest;
import com.api.model.request.UpdateProfileRequest;
import com.api.model.response.LoginResponse;
import com.api.model.response.UserProfileManagementResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {


	@Test(description="Verify update profile API working fine")
	public void updateProfileTest() {
		
		AuthService service = new AuthService();
		Response response = service.loginAPI(new LoginRequest("Guru@2026", "Guru@2620"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println("=================================================================");
		
		
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		UserProfileManagementResponse userProfileManagementResponse = response.as(UserProfileManagementResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println("=================================================================");
		
		UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest.Builder().firstName("Guru")
		.lastName("Umbarka").email("umbarkargurudatta@gmail.com").mobileNumber("7249796404").build();
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), updateProfileRequest);
		System.out.println(response.asPrettyString());
		
	}
}
