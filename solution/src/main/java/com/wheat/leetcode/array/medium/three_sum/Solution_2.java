package com.wheat.leetcode.array.medium.three_sum;

import com.wheat.leetcode.utils.SortedArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_2 {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        int lastLessZero = SortedArrayUtil.searchLastLess(nums, 0);

        if (lastLessZero == nums.length - 1) {
            return result;
        }

        int firstGreaterZero = SortedArrayUtil.searchFirstGreater(nums, 0);

        if (firstGreaterZero == -1) {
            if (nums[nums.length - 3] == 0) {
                List<Integer> list = new ArrayList<>(3);
                list.add(0);
                list.add(0);
                list.add(0);
                result.add(list);
            }
            return result;
        }

        int zeroNumber = firstGreaterZero - lastLessZero - 1;

        if (zeroNumber > 2) {
            List<Integer> list = new ArrayList<>(3);
            list.add(0);
            list.add(0);
            list.add(0);
            result.add(list);
        }

        int lr = lastLessZero + 1,rStart1 = firstGreaterZero, rEnd1;

        int rStart2 = firstGreaterZero - zeroNumber, rEnd2;

        for (int i = 0; i < lr;) {
            rEnd1 = nums.length - 1;
            for (int j = i + 1; j < lr;) {
                int sum = nums[i] + nums[j];
                int index = SortedArrayUtil.search(nums, rStart1, rEnd1, -sum);
                if (index != -1) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-sum);
                    result.add(list);
                    rEnd1 = index;
                }
                while (nums[j] == nums[++j]) { }
            }
            rEnd2 = nums.length - 1;
            for (int j = rStart2; j < rEnd2;) {
                int sum = nums[i] + nums[j];
                int index = SortedArrayUtil.search(nums, j + 1, rEnd2, -sum);
                if (index != -1) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-sum);
                    result.add(list);
                    rEnd2 = index;
                }
                while (j < rEnd2 && nums[j] == nums[++j]) { }
            }

            while (nums[i] == nums[++i]) { }
        }
        return result;
    }
}
