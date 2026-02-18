package com.api.base;

import java.util.HashMap;

import com.api.model.request.LoginRequest;
import com.api.model.request.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	
	
	private static final String BASE_PATH = "/api/auth/";
	
	public Response loginAPI(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}
	
	public Response signUp(SignUpRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}
	
	public Response forgotPassword(String email) {
		HashMap<String,String> payload = new HashMap<>();
		payload.put("email", email);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}
	
	

}
