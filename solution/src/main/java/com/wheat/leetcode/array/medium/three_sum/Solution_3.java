package com.wheat.leetcode.array.medium.three_sum;

import java.util.*;

public class Solution_3 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> set;
        int end = nums.length - 2;

        for (int i = 0; i < end;) {

            if (nums[i] > 0) {
                return result;
            }
            set = new HashSet<>(nums.length - i);
            for (int j = i + 1; j < nums.length;) {
                if (set.contains(nums[j])) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(-nums[i] - nums[j]);
                    list.add(nums[j]);
                    result.add(list);
                    while (++j < nums.length) {
                        if (nums[j - 1] != nums[j]) {
                            break;
                        }
                    }
                } else {
                    set.add(-nums[i] - nums[j]);
                    ++j;
                }
            }
            while (i < end && nums[i] == nums[++i]) { }
        }
        return result;
    }
}
