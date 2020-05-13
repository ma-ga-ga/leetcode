package com.wheat.leetcode.array.medium.three_sum;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

    @org.junit.Test
    public void testOne() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = Solution_1.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testTwo() {
        int[] input = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists = Solution_1.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testThere() {
        int[] input ={-1, 0, 1, 2};
        List<List<Integer>> lists = Solution_1.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testOne2() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = Solution_2.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testTwo2() {
        int[] input = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists = Solution_2.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testThere2() {
        int[] input = {6,-5,-6,-1,-2,8,-1,4,-10,-8,-10,-2,-4,-1,-8,-2,8,9,-5,-2,-8,-9,-3,-5};
        List<List<Integer>> lists = Solution_2.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testOne3() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = Solution_3.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testTwo3() {
        int[] input = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lists = Solution_3.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }

    @org.junit.Test
    public void testThere3() {
        int[] input = {6,-5,-6,-1,-2,8,-1,4,-10,-8,-10,-2,-4,-1,-8,-2,8,9,-5,-2,-8,-9,-3,-5};
        List<List<Integer>> lists = Solution_3.threeSum(input);
        for (List<Integer> list : lists) {
            String s = String.join(",", list.stream().map(Number::toString).collect(Collectors.toList()));
            System.out.println("[" + s + "]");
        }
    }
}
