package com.chetan.lovableAI.controller;

import com.chetan.lovableAI.dto.plan.PlanResponse;
import com.chetan.lovableAI.dto.subscription.CheckoutRequest;
import com.chetan.lovableAI.dto.subscription.CheckoutResponse;
import com.chetan.lovableAI.dto.subscription.PortalResponse;
import com.chetan.lovableAI.dto.subscription.SubscriptionResponse;
import com.chetan.lovableAI.service.PlanService;
import com.chetan.lovableAI.service.SubscriptionService;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billing")
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class BillingController {

    PlanService planService;
    SubscriptionService subscriptionService;

    @GetMapping("/plans")
    public ResponseEntity<List<PlanResponse>> getAllPlans(){
        return ResponseEntity.ok(planService.getAllActivePlans());
    }

    @GetMapping("/me/subscription")
    public ResponseEntity<SubscriptionResponse> getMySubscription(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(userId));
    }

    @PostMapping("/strip/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request,userId));
    }

    @PostMapping("/strip/portal")
    public ResponseEntity<PortalResponse> createCheckoutResponse(){
        Long userId = 1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(userId));
    }


}
