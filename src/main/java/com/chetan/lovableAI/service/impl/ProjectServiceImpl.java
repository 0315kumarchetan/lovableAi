package com.chetan.lovableAI.service.impl;
import com.chetan.lovableAI.dto.project.ProjectRequest;
import com.chetan.lovableAI.dto.project.ProjectResponse;
import com.chetan.lovableAI.dto.project.ProjectSummaryResponse;
import com.chetan.lovableAI.entity.Project;
import com.chetan.lovableAI.entity.User;
import com.chetan.lovableAI.mapper.ProjectMapper;
import com.chetan.lovableAI.repository.ProjectRepository;
import com.chetan.lovableAI.repository.UserRepository;
import com.chetan.lovableAI.service.ProjectService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class ProjectServiceImpl implements ProjectService {

    ProjectRepository projectRepository;
    UserRepository userRepository;
    ProjectMapper projectMapper;


    @Override
    public @Nullable List<ProjectSummaryResponse> getUserProjects(Long userId) {
        List<Project> projectList = projectRepository.findAllAccessibleByUser(userId);
        return projectMapper.toListProjectSummaryResponse(projectList);
    }

    @Override
    public @Nullable ProjectResponse getUserProjectById(Long id) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse createProject(ProjectRequest request, Long userId) {
        User user = userRepository.findById(userId).orElseThrow();

        Project project = Project.builder()
                .owner(user)
                .name(request.name())
                .isPublic(false)
                .build();
        Project savedProject = projectRepository.save(project);
        return projectMapper.toProjectResponse(savedProject);
    }

    @Override
    public @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
