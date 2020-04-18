package com.wheat.leetcode.array.hard.median_of_two_sorted_arrays;

public class Solution_1 {

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        if (m > n) {
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }

        int iMin = 0, iMax = m, halfLength = (m + n) / 2;

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLength - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = i + 1;
            } else if(i > iMin && A[i - 1] > B[j]) {
                iMax = i - 1;
            } else {
                int minRight;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }
                if ( (m + n) % 2 == 1 ) { return minRight; }

                int maxLeft;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }
}
