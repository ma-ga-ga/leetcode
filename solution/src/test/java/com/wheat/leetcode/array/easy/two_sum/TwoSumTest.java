package com.wheat.leetcode.array.easy.two_sum;

import org.junit.Test;

public class TwoSumTest
{
    @Test
    public void test()
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution_1.twoSum(nums, target);
        if (result.length != 0) {
            System.out.println(nums[result[0]] + " and " + nums[result[1]] + " equals " + target);
        }
    }
}
