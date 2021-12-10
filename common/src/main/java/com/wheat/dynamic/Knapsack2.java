package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-06 19:26
 **/
public class Knapsack2 {

    public static void main(String[] args) {
        int[] weights = {2, 2, 4, 6, 3};
        int knapsack = knapsack(weights, 9);
        System.out.println("-----------" + knapsack);
    }

    /**
     * 背包问题
     * @param weights 所有物品
     * @param w 背包最大重量
     * @return
     */
    public static int knapsack(int[] weights, int w) {
        int n = weights.length;
        boolean[][] states = new boolean[n][w + 1];
        states[0][0] = true;
        if (weights[0] <= w) {
            states[0][weights[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w; j++) {
                if (states[i-1][j]) {
                    states[i][j] = true;
                }
            }
            for (int j = 0; j <= w - weights[i]; j++) {
                if (states[i-1][j]) {
                    states[i][weights[i] + j] = true;
                }
            }
        }
        for (int i = w; i >= 0; i--) {
            if (states[n-1][i]) {
                return i;
            }
        }
        return 0;
    }
}
