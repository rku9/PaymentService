package com.backend.paymentservice.gateways;

import com.stripe.exception.StripeException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId) throws StripeException;
}
