package com.wheat.dynamic;

import java.util.Arrays;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-08 11:40
 **/
public class Change2 {

    public static void main(String[] args) {
        int[] coins = {3, 5, 7};
        int[] change = change(coins, 1234);
        int[] compose = findChange(coins, change);
        System.out.println(Arrays.toString(compose));
    }

    private static int[] findChange(int[] coins, int[] changes) {
        int n = changes.length - 1;
        int[] results = new int[coins[coins.length - 1] + 1];
        int changeNum = changes[n];
        if (changeNum == -1) {
            return results;
        }
        for (int i = n; i > 0;) {
            changeNum--;
            for (int j = 0; j < coins.length; j++) {
                int last = i - coins[j];
                if (last >= 0 && changes[last] == changeNum) {
                    results[coins[j]]++;
                    i = last;
                    break;
                }
            }
        }
        return results;
    }

    private static int[] change(int[] coins, int n) {
        int[] states = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            states[i] = -1;
        }
        states[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < coins.length; j++) {
                int last = i - coins[j];
                if (last >= 0 && states[last] >= 0) {
                    states[i] = min(states[last] + 1, states[i]);
                }
            }
        }
        return states;
    }

    private static int min(int a, int b) {
        if (a == -1) {
            return b;
        }

        if (b == -1) {
            return a;
        }

        return Math.min(a, b);
    }
}
