package com.bipin.streams.DupElement;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

//How to find only duplicate elements with its count from the String ArrayList in Java8?
public class DupElement {
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> Temp = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                        .entrySet()
                                .stream().filter(entry -> entry.getValue() > 1)
                                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(Temp);
    }
}
