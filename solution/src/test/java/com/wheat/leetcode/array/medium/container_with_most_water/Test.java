package com.wheat.leetcode.array.medium.container_with_most_water;

public class Test {

    @org.junit.Test
    public void testOne() {
       int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
       int result = Solution_2.maxArea(input);
        System.out.println(result);
    }

    @org.junit.Test
    public void testTwo() {
        int[] input = {1,2,3,4,5,25,24,3,4};
        int result = Solution_2.maxArea(input);
        System.out.println(result);
    }
}
