package com.bipin.streams.ListToObjDupKey;

import java.util.*;
import java.util.stream.Collectors;

//How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order
//How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
public class ListToObjDupkey {
    public static void main(String[] args)
    {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));
        noteLst.add(new Notes(6, "note4", 66));

        Map<String, Long> noteLstTemp = noteLst.stream()
                .sorted(Comparator.comparing(Notes::getTagName).reversed())
                .collect(Collectors.toMap(
                        Notes::getTagName,
                        Notes::getTagId,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
        System.out.println(noteLstTemp);

      Optional.ofNullable(noteLst)
              .orElseGet(Collections::emptyList)
              .stream().filter(Objects::nonNull)
              .map(Notes::getTagName)
              .forEach(System.out::println);
    }
}
