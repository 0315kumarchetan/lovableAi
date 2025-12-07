package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.project.FileContentRespose;
import com.chetan.lovableAI.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    @Nullable List<FileNode> getFileTree(Long projectId, Long userId);

    @Nullable List<FileContentRespose> getFileContent(Long projectId, Long userId);
}
