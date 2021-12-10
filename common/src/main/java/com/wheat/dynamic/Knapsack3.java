package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-06 19:26
 **/
public class Knapsack3 {

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
        int[] states = new int[w + 1];
        for (int i = 0; i < n; ++i) {
            states[i] = -1;
        }
        states[0] = 0;
        if (weights[0] <= w) {
            states[weights[0]] = values[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= w - weights[i]; j++) {
                if (states[j] >= 0) {
                    int v = states[j] + values[i];
                    if (v > states[weights[i] + j]) {
                        states[weights[i] + j] = v;
                    }
                }
            }
        }
        int maxValue = -1;
        for (int i = 0; i <= w; i++) {
            if (states[i] > maxValue) {
                maxValue = states[i];
            }
        }
        return maxValue;
    }
}
