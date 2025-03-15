package com.backend.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

@Getter
@Setter
public class GeneratePaymentLinkDto {
    private Long orderId;
}
