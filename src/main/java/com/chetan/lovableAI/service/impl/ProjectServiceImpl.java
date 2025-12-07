package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.project.ProjectRequest;
import com.chetan.lovableAI.dto.project.ProjectResponse;
import com.chetan.lovableAI.dto.project.ProjectSummaryResponse;
import com.chetan.lovableAI.service.ProjectService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public @Nullable ProjectSummaryResponse getUserProject(Long userId) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse getUserProjectById(Long id) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
