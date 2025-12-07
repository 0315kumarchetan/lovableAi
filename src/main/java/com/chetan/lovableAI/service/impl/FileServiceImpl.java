package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.project.FileContentRespose;
import com.chetan.lovableAI.dto.project.FileNode;
import com.chetan.lovableAI.service.FileService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public @Nullable List<FileNode> getFileTree(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public @Nullable List<FileContentRespose> getFileContent(Long projectId, Long userId) {
        return List.of();
    }
}
