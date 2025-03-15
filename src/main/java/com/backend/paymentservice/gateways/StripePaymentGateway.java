package com.backend.paymentservice.gateways;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentLink;
import com.stripe.model.Price;
import com.stripe.param.PaymentLinkCreateParams;
import com.stripe.param.PriceCreateParams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("Stripe")
public class StripePaymentGateway implements PaymentGateway{
    @Value("${stripe.key}")
    private String stripeKey;

//    @Value("stripe.Secret")
//    private String stripeSecret;

    @Override
    public String generatePaymentLink(Long orderId) throws StripeException {
            Stripe.apiKey = stripeKey;


        PriceCreateParams params =
                PriceCreateParams.builder()
                        .setCurrency
                                ("gbp")
                        .setUnitAmount
                                (500L)
                        .setProductData(PriceCreateParams.ProductData.builder().setName("water").build()
                        )
                        .build();

        Price price = Price.create(params);

            PaymentLinkCreateParams params2 =
                    PaymentLinkCreateParams.builder()
                            .addLineItem(
                                    PaymentLinkCreateParams.LineItem.builder()
                                            .setPrice(price.getId())
                                            .setQuantity(1L)
                                            .build()
                            )
                            .build();

            PaymentLink paymentLink = PaymentLink.create(params2);
            return paymentLink.toString();
        }
    }

