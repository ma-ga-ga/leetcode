package com.wheat.leetcode.utils;

public class SortedArrayUtil {

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] nums, int start, int end, int target) {
        int l = start, r = end;

        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }

    public static int searchLastLess(int[] nums, int target) {
        return searchLastLess(nums, 0, nums.length - 1, target);
    }

    public static int searchLastLess(int[] nums, int start, int end, int target) {
        int l = start, r = end;

        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        if (l == 0) {
            return -1;
        }

        return l - 1;
    }

    public static int searchLastLessEqual(int[] nums, int target) {
        return searchLastLessEqual(nums, 0, nums.length - 1, target);
    }

    public static int searchLastLessEqual(int[] nums, int start, int end, int target) {
        int l = start, r = end;

        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] <= target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        if (l == 0) {
            return -1;
        }

        return l - 1;
    }

    public static int searchFirstGreater(int[] nums, int target) {
        return searchFirstGreater(nums, 0, nums.length - 1, target);
    }

    public static int searchFirstGreater(int[] nums, int start, int end, int target) {
        int l = start, r = end;

        while (l <= r) {
            int m = (l + r) >>> 1;
            if (nums[m] <= target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (r == end) {
            return -1;
        }

        return r + 1;
    }

    public static int searchFirstGreaterEqual(int[] nums, int target) {
        return searchFirstGreaterEqual(nums, 0, nums.length - 1, target);
    }

    public static int searchFirstGreaterEqual(int[] nums, int start, int end, int target) {
        int l = start, r = end;

        while (l <= r) {
            int m = (l + r) >>> 1;
             if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (r == end) {
            return -1;
        }

        return r + 1;
    }
}
