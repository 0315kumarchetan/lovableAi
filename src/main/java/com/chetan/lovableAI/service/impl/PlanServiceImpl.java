package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.plan.PlanResponse;
import com.chetan.lovableAI.service.PlanService;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public @Nullable List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
