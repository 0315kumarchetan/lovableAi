package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.member.InviteMemberRequest;
import com.chetan.lovableAI.dto.member.MemberResponse;
import com.chetan.lovableAI.dto.member.UpdateMemberRoleRequest;
import com.chetan.lovableAI.entity.ProjectMember;
import com.chetan.lovableAI.service.ProjectMemberService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public @Nullable List<MemberResponse> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public @Nullable ProjectMember inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
