package com.chetan.lovableAI.service;
import com.chetan.lovableAI.dto.subscription.CheckoutRequest;
import com.chetan.lovableAI.dto.subscription.CheckoutResponse;
import com.chetan.lovableAI.dto.subscription.PortalResponse;
import com.chetan.lovableAI.dto.subscription.SubscriptionResponse;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

@Service
public interface SubscriptionService {
    @Nullable
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
