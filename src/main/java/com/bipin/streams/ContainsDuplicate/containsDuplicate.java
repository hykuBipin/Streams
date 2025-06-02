package com.bipin.streams.ContainsDuplicate;

import java.util.*;
import java.util.stream.Collectors;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class containsDuplicate {
    public static void main(String[] args)
    {
        int[] arr = {10,15,8,49,25,98,98,32,15};
        int[] arr2 = {10,15,8,49,25,97,98,32,19};

        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);
        boolean checkdup = list.size() <= set.size();
        System.out.println(checkdup);

        List<Integer> list2 = Arrays.stream(arr2).boxed().sorted().collect(Collectors.toList());
        Set<Integer> set2 = new HashSet<>(list2);
        boolean checkdup2 = list2.size() <= set2.size();
        System.out.println(checkdup2);
    }
}
