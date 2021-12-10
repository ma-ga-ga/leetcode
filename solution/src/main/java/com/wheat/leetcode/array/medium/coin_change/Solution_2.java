package com.wheat.leetcode.array.medium.coin_change;

public class Solution_2 {

    public int coinChange(int[] coins, int amount) {
        int n = amount + 1;
        int[] states = new int[n];
        for (int i = 1; i < n; i++) {
            states[i] = n;
        }
        states[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                int last = i - coins[j];
                if (last >= 0) {
                    states[i] = Math.min(states[i], states[i - coins[j]] + 1);
                }
            }
        }
        return states[amount] > amount ? -1 : states[amount];
    }
}
