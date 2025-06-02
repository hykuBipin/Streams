package com.bipin.streams.NumberStartingWithOne;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class NumberStartingWithOne {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,15,18,49,25,198,32,00,96,16,66,334);
        list.stream()
                .map(s -> s + "" )  //changing integer to String
                .filter( s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
