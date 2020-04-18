package com.wheat.leetcode.string.medium.longest_palindromic_substring;

public class Solution_1 {

    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int longest = chars.length != 0 ? 1 : 0, start = 0;
        int doubleLength = chars.length * 2 - 1;
        for (int i = 0; i < doubleLength; i++) {
            int residue = i & 1;
            int left = (i - 2 + residue) >> 1;
            int right = (i + 2 - residue) >> 1;
            int palindromeLength = 1 - residue;
            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                palindromeLength += 2;
                left--;
                right++;
            }
            if (palindromeLength > longest) {
                longest = palindromeLength;
                start = left + 1;
            }
        }
        return s.substring(start, start + longest);
    }
}
