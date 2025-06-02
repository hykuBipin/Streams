package com.bipin.streams.FirstElement;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//Given the list of integers, find the first element of the list using Stream functions?
public class FindFirstElement {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(8,23,24,5,56,2,8,124,678,16);
//        List<Integer> list = Arrays.asList();

        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
