package amazon.oa2020.a200_longestPalindromicSubstring;

//200. Longest Palindromic Substring
//        中文English
//        Given a string S, find the longest palindromic substring in S.
//        You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
//
//        Example
//        Example 1:
//
//        Input:"abcdzdcab"
//        Output:"cdzdc"
//        Example 2:
//
//        Input:"aba"
//        Output:"aba"
//        Challenge
//        O(n2) time is acceptable. Can you do it in O(n) time.

public class Solution {
    protected static final boolean SOLUTION_DONE = true;
    /**
     * @param s: input string
     * @return: the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            System.out.println(len);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int leftCenter, int rightCenter) {
        int left = leftCenter;
        int right = rightCenter;

        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left --;
            right ++;
        }

        return right - left - 1;
    }
}
