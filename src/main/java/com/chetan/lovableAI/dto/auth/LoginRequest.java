package com.chetan.lovableAI.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
