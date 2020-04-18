package com.wheat.leetcode.array.hard.median_of_two_sorted_arrays;

import org.junit.Test;

public class MedianOfTwoSortedArraysTest {

    @Test
    public void testOne()
    {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = Solution_1.findMedianSortedArrays(nums1, nums2);
        System.out.println("zhe median is " + result);
    }

    @Test
    public void testTwo()
    {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = Solution_1.findMedianSortedArrays(nums1, nums2);
        System.out.println("zhe median is " + result);
    }

    @Test
    public void testThree()
    {
        int[] nums1 = {2};
        int[] nums2 = {-2, -1};
        double result = Solution_1.findMedianSortedArrays(nums1, nums2);
        System.out.println("zhe median is " + result);
    }
}
