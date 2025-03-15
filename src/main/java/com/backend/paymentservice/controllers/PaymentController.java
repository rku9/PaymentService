package com.backend.paymentservice.controllers;

import com.backend.paymentservice.dtos.GeneratePaymentLinkDto;
import com.backend.paymentservice.services.PaymentService;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.param.PaymentLinkCreateParams;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

@Getter
@Setter
@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/generate")
    public String generatePaymentLink(@RequestBody GeneratePaymentLinkDto generatePaymentLinkDto) throws StripeException {
        //this will pass in the parameters needed for the generation of a payment link to the service.
        return paymentService.generatePaymentLink(generatePaymentLinkDto.getOrderId());
    }
}
