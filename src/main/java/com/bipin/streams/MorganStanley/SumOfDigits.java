package com.bipin.streams.MorganStanley;

//Find the Sum of digits
public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;

        int result =String.valueOf(n)
                .chars()
                .map(c -> c - '0')
                .sum();
        System.out.println("sum: " +result);

    }
}
