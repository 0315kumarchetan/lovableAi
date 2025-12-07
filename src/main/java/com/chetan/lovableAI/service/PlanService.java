package com.chetan.lovableAI.service;

import com.chetan.lovableAI.dto.plan.PlanResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {
    @Nullable List<PlanResponse> getAllActivePlans();
}
