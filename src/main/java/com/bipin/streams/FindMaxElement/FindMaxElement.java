package com.bipin.streams.FindMaxElement;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the maximum value element present in it using Stream functions?
public class FindMaxElement {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(78,335,9999,357,1,0);
        int max= list.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
