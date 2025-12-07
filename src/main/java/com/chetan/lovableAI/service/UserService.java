package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
