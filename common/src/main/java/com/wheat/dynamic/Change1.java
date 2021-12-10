package com.wheat.dynamic;

/**
 * @description:
 * @author: mj
 * @create: 2021-12-08 11:40
 **/
public class Change1 {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 50;
        int[] mem = new int[amount + 1];
        int i = change1(coins, amount, mem);
        System.out.println(i );
    }

    private static int change(int[] coins, int n) {
        if (n == 0) {
            return 0;
        }
        int step = n + 1;
        for (int j = 0; j < coins.length; j++) {
            int last = n - coins[j];
            if (last >= 0) {
                int temp = change(coins, n - coins[j]);
                if (temp != -1) {
                    step = Math.min(temp, step);
                }
            }
        }
        return step > n ? -1 : step + 1;
    }

    private static int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

    private static int change1(int[] coins, int n, int[] mem) {
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
                int temp = change1(coins, last, mem);
                if (temp != -1 && temp < step) {
                    step = temp;
                }
            }
        }
        step = step > n ? -1 : step + 1;
        mem[n] = step;
        return step;
    }
}
