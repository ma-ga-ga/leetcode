package com.wheat.leetcode.array.medium.coin_change;

public class Solution_1 {

    public int coinChange(int[] coins, int amount) {
        return change(coins, amount, new int[amount + 1]);
    }

    private static int change(int[] coins, int n, int[] mem) {
        if (n == 0) {
            return 0;
        }
        if (mem[n] != 0) {
            return mem[n];
        }
        int step = n + 1;
        for (int j = 0; j < coins.length; j++) {
            int last = n - coins[j];
            if (last >= 0) {
                int temp = change(coins, last, mem);
                if (temp != -1 && temp < step) {
                    step = temp;
                }
            }
        }
        mem[n] = step > n ? -1 : step + 1;
        return mem[n];
    }
}
