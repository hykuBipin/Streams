package com.bipin.streams.MapToObjUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How to use map to convert object into Uppercase in Java 8?
public class MapToObjUpperCase {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Java", "8");
        List<String> nameLst = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
               System.out.println(nameLst);
    }
}
