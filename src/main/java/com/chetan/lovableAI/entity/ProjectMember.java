package com.chetan.lovableAI.entity;

import com.chetan.lovableAI.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    User user;
    Project project;
    ProjectRole role;
    String invitedBy;
    Instant invitedAt;
}
