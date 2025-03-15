package com.backend.paymentservice.services;

import com.backend.paymentservice.gateways.PaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    private PaymentGateway paymentGateway;
    public PaymentService(@Qualifier("Stripe") PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public String generatePaymentLink(Long orderId) throws StripeException {
        return paymentGateway.generatePaymentLink(orderId);
    }
}
