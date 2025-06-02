package com.bipin.streams.SortAndStream;

import java.util.Arrays;

//Write a Java 8 program to sort an array and then convert the sorted array into Stream?
public class SortAndStream {
    public static void main(String[] args)
    {
        int arr[] = {144,56,3,678,223,2,67,89,8,6,16,44};
        Arrays.parallelSort(arr);
        Arrays.stream(arr)
                .forEach(n -> System.out.print(n + " "));
    }
}
