package com.wheat.leetcode.string.medium.longest_palindromic_substring;

import org.junit.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void testOne() {
        String input = "babad";
        String p = Solution_1.longestPalindrome(input);
        System.out.println(p);
    }

    @Test
    public void testTwo() {
        String input = "cbbd";
        String p = Solution_1.longestPalindrome(input);
        System.out.println(p);
    }

    @Test
    public void testThere() {
        String input = "";
        String p = Solution_1.longestPalindrome(input);
        System.out.println(p);
    }
}
