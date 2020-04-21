package com.wheat.leetcode.array.medium.container_with_most_water;

public class Solution_1 {

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] <= height[right]) {
                ++left;
            }
            else {
                --right;
            }
        }
        return maxArea;
    }
}
