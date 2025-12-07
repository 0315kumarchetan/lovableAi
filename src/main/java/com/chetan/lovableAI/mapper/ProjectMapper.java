package com.chetan.lovableAI.mapper;

import com.chetan.lovableAI.dto.project.ProjectResponse;
import com.chetan.lovableAI.dto.project.ProjectSummaryResponse;
import com.chetan.lovableAI.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListProjectSummaryResponse(List<Project> projectList);
}
