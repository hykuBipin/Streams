package com.bipin.streams.NielsenMedia;

import java.util.*;
import java.util.stream.Collectors;

//Find the first N repeating element in an array of integers
public class Test {
    public static void main(String[] args) {
        int[] num ={ 1,2,3,1,2,3};
        int N=2;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> result =new ArrayList<>();

        for(int nums: num)

        {
             map.put(nums, map.getOrDefault(nums,0)+1);
            if(map.get(nums)==2)
            {
                result.add(nums);
                if(result.size()==N)
                {
                    break;
                }
            }
        }
        System.out.println("Result" +result);

        //using streams to achieve same
        Set<Integer> seen = new HashSet<>();
        int X=3;
        List<Integer> dup = Arrays.stream(num)
                .boxed()
                .filter(n -> !seen.add(n))
                .distinct()
                .limit(X)
                .collect(Collectors.toList());
        System.out.println("Out" +dup);
    }

}

