package com.bipin.streams.FindMax;

import java.util.Arrays;

//Write a Program to find the Maximum element in an array?
public class FindMax {
    public static void main(String[] args)
    {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        int result = Arrays.stream(arr).max().getAsInt();
        System.out.println(result);
    }
}
