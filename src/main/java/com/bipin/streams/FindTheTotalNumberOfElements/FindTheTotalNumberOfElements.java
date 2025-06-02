package com.bipin.streams.FindTheTotalNumberOfElements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

//Given a list of integers, find the total number of elements present in the list using Stream functions?
public class FindTheTotalNumberOfElements {
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(8,13,24,16,3455,234,456);
        long count = list.stream().count();
        System.out.println(count);
    }
}
