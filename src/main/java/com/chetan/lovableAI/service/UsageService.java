package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.plan.PlanLimitsResponse;
import com.chetan.lovableAI.dto.usage.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {
    @Nullable UsageTodayResponse getTodayUsageOfUser(Long userId);

    @Nullable PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
