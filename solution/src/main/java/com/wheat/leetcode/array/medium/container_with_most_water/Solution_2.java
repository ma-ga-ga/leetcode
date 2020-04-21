package com.wheat.leetcode.array.medium.container_with_most_water;

public class Solution_2 {

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int shorter = Math.min(height[left], height[right]);
        int maxArea = (right - left) * Math.min(height[left], height[right]);
        while (left < right) {
            if (height[left] < height[right]) {
                for (left = left + 1; left < right; left++) {
                    if (height[left] > shorter) {
                        break;
                    }
                }
            } else {
                for (right = right - 1; left < right; right--) {
                    if (height[right] > shorter) {
                        break;
                    }
                }
            }
            shorter = Math.min(height[left], height[right]);
            maxArea = Math.max((right - left) * shorter, maxArea);
        }
        return maxArea;
    }
}
