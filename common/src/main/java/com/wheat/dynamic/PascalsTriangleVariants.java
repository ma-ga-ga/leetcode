package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-07 17:23
 **/
public class PascalsTriangleVariants {

    public static void main(String[] args) {
        int[][] matrix = {{5},{7,8},{2,3,4},{4,9,6,1},{11,7,9,4,5}};
        System.out.println(shortestPath(matrix));
    }

    private static int shortestPath(int[][] matrix) {
        int n = matrix.length;
        int[] states = new int[n + 1];
        states[0] = matrix[0][0];
        for (int i = 1; i < n; i++) {
            int[] row = matrix[i];
            int temp = states[0];
            for (int j = 0; j < row.length; j++) {
                if (j == 0) {
                    temp = states[j];
                    states[j] = row[j] + states[j];
                } else if (j == row.length - 1) {
                    states[j] = row[j] + temp;
                } else {
                    int v1 = row[j] + temp;
                    int v2 = row[j] + states[j];
                    temp = states[j];
                    states[j] = v1 < v2 ? v1 : v2;
                }
            }
        }
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (minValue > states[i]) {
                minValue = states[i];
            }
        }
        return minValue;
    }
}
