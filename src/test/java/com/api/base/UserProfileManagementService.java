package com.api.base;

import com.api.model.request.UpdateProfileRequest;

import io.restassured.response.Response;

public class UserProfileManagementService extends BaseService {
	
	public static final String BASE_URI = "/api/users/";
	
	
	public Response getProfile(String token) {
		setAuthToken(token);
		return getRequest(BASE_URI + "profile");
		
	}
	
	public Response updateProfile(String token,UpdateProfileRequest payLoad ) {
		setAuthToken(token);
		return putRequest(payLoad, BASE_URI+ "profile");
		
	}
	

}
