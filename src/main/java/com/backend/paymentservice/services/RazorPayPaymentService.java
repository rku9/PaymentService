package com.backend.paymentservice.services;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class RazorPayPaymentService {
    static int mod = (int) 1e6 + 7;
    static int mod_i = (int) 1e9 + 7;
    static long mod_l = (long) 1e12 + 7;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        
       
        bw.write(String.valueOf(()));
        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }
}
