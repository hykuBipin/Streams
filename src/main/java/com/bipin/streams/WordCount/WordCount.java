package com.bipin.streams.WordCount;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//How to count each element/word from the String ArrayList in Java8?
public class WordCount {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
       Map<String,Long> templist = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
       System.out.println(templist);
    }
}
