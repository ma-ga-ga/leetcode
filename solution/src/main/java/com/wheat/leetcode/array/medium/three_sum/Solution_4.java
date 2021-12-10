package com.wheat.leetcode.array.medium.three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_4 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        int scope = nums.length - 2;

        for (int i = 0; i < scope; ) {

            int current = nums[i];

            if (current > 0) {
                break;
            }

            if ((nums[i] + nums[i + 1] + nums[i + 2]) > 0) {
                break;
            }

            if ((nums[i] + nums[scope] + nums[scope + 1]) < 0) {
                i++;
                while (nums[i - 1] == nums[i]) {
                    if (i > scope) {
                        return result;
                    }
                    i++;
                }
                continue;
            }
            int l = ++i, r = nums.length - 1;
            while (l < r) {
                int sum = current + nums[l] + nums[r];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(current);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    while (l < r && nums[l] == nums[++l]) {
                    }
                    while (l < r && nums[r] == nums[--r]) {
                    }
                } else if (sum > 0) {
                    r -= 1;
                } else {
                    l += 1;
                }
            }
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
