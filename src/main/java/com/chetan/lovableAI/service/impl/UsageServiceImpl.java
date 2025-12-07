package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.plan.PlanLimitsResponse;
import com.chetan.lovableAI.dto.usage.UsageTodayResponse;
import com.chetan.lovableAI.service.UsageService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public @Nullable UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public @Nullable PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
