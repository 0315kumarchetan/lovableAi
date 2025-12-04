package com.chetan.lovableAI.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
