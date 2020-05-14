package com.wheat.leetcode.array.medium.four_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums == null && nums.length < 3) {
            return result;
        }

        int firstLayerScope  = nums.length - 3;
        int secondLayerScope  = nums.length - 2;

        Arrays.sort(nums);

        for (int i = 0; i < firstLayerScope;) {

            if((nums[i]+nums[i+1]+nums[i+2]+nums[i+3]) > target){
                break;
            }

            if((nums[i]+nums[firstLayerScope]+nums[firstLayerScope + 1]+nums[firstLayerScope + 2]) < target){
                i++;
                while (nums[i - 1] == nums[i]) {
                    if (i > firstLayerScope) {
                        return result;
                    }
                    i++;
                }
                continue;
            }

            for(int j = i + 1; j < secondLayerScope;) {

                if((nums[i]+nums[j]+nums[j+1]+nums[j+2]) > target){
                    break;
                }

                if((nums[i]+nums[j]+nums[secondLayerScope]+nums[secondLayerScope + 1]) < target){
                    while (++j < secondLayerScope) {
                        if (nums[j - 1] != nums[j]) {
                            break;
                        }
                    }
                    continue;
                }

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
                while (++j < secondLayerScope) {
                    if (nums[j - 1] != nums[j]) {
                        break;
                    }
                }
            }
            i++;
            while (nums[i - 1] == nums[i]) {
                if (i > firstLayerScope) {
                    return result;
                }
                i++;
            }
        }
        return result;
    }
}
