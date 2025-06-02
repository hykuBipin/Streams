package com.bipin.streams.SortValues;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, sort all the values present in it using Stream functions?
public class SortValues {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(34,23,1,234,56,16,8,46,24);
                list.stream()
                .sorted()
                        .forEach(System.out::println);

        int[] arr = {10,15,8,49,25,98,98,32,15};
        List<Integer> sortedList = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
