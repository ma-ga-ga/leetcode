package com.wheat.leetcode.array.easy.two_sum;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class TwoSumTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution_1.twoSum(nums, target);
        if (result.length != 0) {
            System.out.println(nums[result[0]] + " and " + nums[result[1]] + " equals " + target);
        }
    }
}
