package com.bipin.streams.CubeAndFilter;

import java.util.Arrays;
import java.util.List;

//Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class CubeAndFilter {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,4,6,9,3);
        list.stream()
                .map(i -> i*i*i)
                .filter(i -> i > 50)
                .forEach(System.out::println);
    }
}
