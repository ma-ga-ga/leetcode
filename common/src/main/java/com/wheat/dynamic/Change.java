package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-08 11:40
 **/
public class Change {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(change(coins, 100));
    }

    private static int change(int[] coins, int n) {
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
        return states[n];
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
