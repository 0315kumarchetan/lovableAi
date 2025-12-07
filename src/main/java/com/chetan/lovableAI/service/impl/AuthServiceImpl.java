package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.auth.AuthResponse;
import com.chetan.lovableAI.dto.auth.LoginRequest;
import com.chetan.lovableAI.dto.auth.SignupRequest;
import com.chetan.lovableAI.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
