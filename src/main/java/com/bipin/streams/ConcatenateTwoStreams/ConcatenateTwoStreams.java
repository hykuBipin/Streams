package com.bipin.streams.ConcatenateTwoStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Write a Java 8 program to concatenate two Streams?
public class ConcatenateTwoStreams {
    public static void main(String[] args)
    {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
        List<String> list3 = Arrays.asList("through", "Handson");

        Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
        concatStream.forEach(str -> System.out.print(str + " "));
        System.out.println("*****************************");
        //print the concatenated stream
        Stream<String> concatStream_new = Stream.of(list1,list3,list2)
                        .flatMap(List::stream);
        concatStream_new.forEach(str -> System.out.print(str + " "));
    }
}
