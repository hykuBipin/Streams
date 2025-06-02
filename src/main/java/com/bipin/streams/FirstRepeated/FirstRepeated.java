package com.bipin.streams.FirstRepeated;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.*;
//Given a String, find the first repeated character in it using Stream functions?
public class FirstRepeated {
    public static void main(String[] args)
    {
        String input = "JAVA API 8 Streams";
        Character result = input.chars()
                .mapToObj(ch -> Character.toLowerCase(Character.valueOf((char) ch)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s -> s.getValue() > 1L)
                .map( s-> s.getKey())
                .findFirst()
                .orElse(null);
        System.out.println(result);

        Set<Character> set = new HashSet<>();
        Character result2 = input.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> !set.add(ch))
                .findFirst()
                .orElse(null);
        System.out.println(result2);

    }
}
