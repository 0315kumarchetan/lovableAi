package com.chetan.lovableAI.dto.member;

import com.chetan.lovableAI.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
