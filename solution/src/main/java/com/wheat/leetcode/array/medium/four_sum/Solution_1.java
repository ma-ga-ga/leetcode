package com.wheat.leetcode.array.medium.four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int scope  = nums.length - 3;

        for (int i = 0; i < scope;) {
                for(int j = i + 1; j < nums.length;) {
                    int twoSum = nums[i] + nums[j], l = j + 1, r = nums.length - 1;
                    while (l < r) {
                        int sum = twoSum + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> list = new ArrayList<>(4);
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            result.add(list);
                            while (l < r && nums[l] == nums[++l]) { }
                            while (l < r && nums[r] == nums[--r]) { }
                        } else if (sum > target) {
                            r -= 1;
                        } else {
                            l += 1;
                        }
                    }
                    while (++j < nums.length) {
                        if (nums[j - 1] != nums[j]) {
                            break;
                        }
                    }
                }
                i++;
                while (nums[i - 1] == nums[i]) {
                    if (i > scope) {
                        return result;
                    }
                    i++;
                }
        }
        return result;
    }
}
