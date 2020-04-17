package com.wheat.leetcode.array.easy.two_sum;

import java.util.HashMap;
import java.util.Map;

public class solution_1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            Integer difference = target - nums[index];
            Integer differenceIndex = map.get(difference);
            if (differenceIndex == null) {
                map.put(nums[index], index);
            } else {
                return new int[]{differenceIndex, index};
            }
        }

        return new int[0];
    }
}
