package com.chetan.lovableAI.entity;

import com.chetan.lovableAI.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.apache.logging.log4j.message.Message;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    Project project;
    User user;
    MessageRole role;
    String content;
    String toolCalls;
    String toolCallId;
    Integer tokensUsed;
    Instant createdAt;
}
