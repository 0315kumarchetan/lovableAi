package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.member.InviteMemberRequest;
import com.chetan.lovableAI.dto.member.MemberResponse;
import com.chetan.lovableAI.dto.member.UpdateMemberRoleRequest;
import com.chetan.lovableAI.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {

    @Nullable List<MemberResponse> getProjectMembers(Long projectId, Long userId);

    @Nullable ProjectMember inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    @Nullable MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    @Nullable MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
