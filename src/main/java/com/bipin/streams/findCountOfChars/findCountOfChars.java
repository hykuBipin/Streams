package com.bipin.streams.findCountOfChars;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Write a program to print the count of each character in a String?
public class findCountOfChars {
    public static void main(String[] args)
    {
        String temp = "Process finished with exit code 0";
            Map<String,Long> result = Arrays.stream(temp.split(""))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(str -> str, LinkedHashMap::new, Collectors.counting()));
            System.out.println(result);
    }
}
