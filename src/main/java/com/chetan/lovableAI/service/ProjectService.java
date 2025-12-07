package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.project.ProjectRequest;
import com.chetan.lovableAI.dto.project.ProjectResponse;
import com.chetan.lovableAI.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

public interface ProjectService {
    @Nullable ProjectSummaryResponse getUserProject(Long userId);

    @Nullable ProjectResponse getUserProjectById(Long id);

    @Nullable ProjectResponse createProject(ProjectRequest request,Long userId);

    @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

     void softDelete(Long id, Long userId);
}
