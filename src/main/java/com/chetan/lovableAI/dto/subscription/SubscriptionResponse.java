package com.chetan.lovableAI.dto.subscription;

import com.chetan.lovableAI.dto.plan.PlanResponse;

import java.time.Instant;

public record SubscriptionResponse(
        PlanResponse plan,
        String status,
        Instant periodEnd,
        Long tokensUsedThisCycle
) {
}
