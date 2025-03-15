package com.backend.paymentservice.gateways;

import org.springframework.stereotype.Service;

@Service("RazorPay")
//this class will talk to the razor pay directly.
public class RazorPayPaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink(Long orderId) {
        //talk to the razor pay API

        return "";
    }
}
