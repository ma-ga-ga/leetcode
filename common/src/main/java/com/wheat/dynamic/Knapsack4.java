package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-06 19:26
 **/
public class Knapsack4 {

    public static void main(String[] args) {
        int[] weights = {2, 2, 4, 6, 3};
        int[] values = {3, 4, 8, 9, 6};
        int knapsack = knapsack(weights, values,9);
        System.out.println("-----------" + knapsack);
    }

    /**
     * 背包问题
     * @param weights 所有物品
     * @param w 背包最大重量
     * @return
     */
    public static int knapsack(int[] weights, int[] values, int w) {
        int n = weights.length;
        int[][] states = new int[n][w + 1];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j <= w; ++j) { states[i][j] = -1; }
        }
        states[0][0] = 0;
        if (weights[0] <= w) {
            states[0][weights[0]] = values[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (states[i-1][j] >= 0) {
                    states[i][j] = states[i-1][j];
                }
            }
            for (int j = 0; j <= w - weights[i]; j++) {
                if (states[i-1][j] >= 0) {
                    int v = states[i-1][j] + values[i];
                    if (v > states[i][weights[i] + j]) {
                        states[i][weights[i] + j] = v;
                    }
                }
            }
        }
        int maxValue = -1;
        for (int i = 0; i <= w; i++) {
            if (states[n-1][i] > maxValue) {
                maxValue = states[n-1][i];
            }
        }
        return maxValue;
    }
}
