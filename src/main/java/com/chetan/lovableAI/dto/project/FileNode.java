package com.chetan.lovableAI.dto.project;

import java.time.Instant;

public record FileNode(String path,
                       Instant modifiedAt,
                       Long size,
                       String type) {
}
