package com.bipin.streams.evennumber;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class EvenNumber {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                        .filter(i -> i%2==0)
                                .forEach(System.out::println);
    }
}
