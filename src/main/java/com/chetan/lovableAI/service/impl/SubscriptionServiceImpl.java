package com.chetan.lovableAI.service.impl;

import com.chetan.lovableAI.dto.subscription.CheckoutRequest;
import com.chetan.lovableAI.dto.subscription.CheckoutResponse;
import com.chetan.lovableAI.dto.subscription.PortalResponse;
import com.chetan.lovableAI.dto.subscription.SubscriptionResponse;
import com.chetan.lovableAI.service.SubscriptionService;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Nullable
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
