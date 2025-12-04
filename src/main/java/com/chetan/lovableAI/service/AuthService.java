package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.auth.AuthResponse;
import com.chetan.lovableAI.dto.auth.LoginRequest;
import com.chetan.lovableAI.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
