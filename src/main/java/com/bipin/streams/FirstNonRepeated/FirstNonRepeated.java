package com.bipin.streams.FirstNonRepeated;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Given a String, find the first non-repeated character in it using Stream functions?
public class FirstNonRepeated {
    public static void main(String[] args)
    {
        String input = "Java articles are Awesome";
        Character result = input.chars()
                .mapToObj( s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        Character result2 = input.chars()
                .mapToObj( s -> (char) s)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result2);
    }
}
