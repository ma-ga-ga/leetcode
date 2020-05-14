package com.wheat.leetcode.array.medium.four_sum;


import java.util.List;
import java.util.stream.Collectors;

public class Test {

    @org.junit.Test
    public void testOne() {
        int[] input = {-1,0,1,2,-1,-4};
        int target = -1;
        List<List<Integer>> lists = Solution_1.fourSum(input, target);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testOne2() {
        int[] input = {-1,0,1,2,-1,-4};
        int target = -1;
        List<List<Integer>> lists = Solution_2.fourSum(input, target);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }
}
