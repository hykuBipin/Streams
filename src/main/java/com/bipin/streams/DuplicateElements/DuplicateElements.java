package com.bipin.streams.DuplicateElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class DuplicateElements {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(8,16,8,24,25,78,16,35,8,245,567);
        Set<Integer> set =new HashSet<>();
        Set<Integer> dupset =new HashSet<>();

        list.stream()
                .filter(n -> !set.add(n)) // If add returns false, it's a duplicate
                .forEach(dupset::add);
        dupset.forEach(System.out::println);
        System.out.println("*****************");
        set.forEach(System.out::println);
        System.out.println("*****************");

        List<Integer> mylist = Arrays.asList(8,16,8,24,25,78,16,35,8,245,567);
        mylist.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
