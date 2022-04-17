package microsoft.oa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Given an integer N, returns the maximum possible value obtainable by deleting one '5' digit from N. N has at least one '5' and two digits.
//e.g. N=15958 return 1958 N = -5859 return -589  解法是遍历整个list
public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    // without using String
    public int findLargeNum(int num) {
        if (num < 0) {
            num = -num;
            return -findMin(num);
        }
        return findMax(num);
    }

    private int findMax(int num) {
        int max = Integer.MIN_VALUE;
        int length = (int)Math.log10(num) + 1;
        for (int i = 0; i < length; i++) {
            if (i < length - 1 && getDigit(num, i) == 5 && getDigit(num, i + 1) > 5) {
                max = deleteDigit(num, i);
                break;
            }
            if (getDigit(num, i) == 5) {
                max = Math.max(max, deleteDigit(num, i));
            }
        }
        return max;
    }

    private int findMin(int num) {
        int min = Integer.MAX_VALUE;
        int length = (int)Math.log10(num);
        for (int i = 0; i < length + 1; i++) {
            if (i < length - 1 && getDigit(num, i) == 5 && getDigit(num, i + 1) < 5) {
                min = deleteDigit(num, i);
                break;
            }
            if (getDigit(num, i) == 5) {
                min = Math.min(min, deleteDigit(num, i));
            }
        }
        return min;
    }

    // index is from left to right. index starts from 0
    // input: 15958, 0, output: 5958
    public int deleteDigit(int num, int index) {
//        StringBuilder sb = new StringBuilder("" + num);
//        sb.deleteCharAt(index);
//        return Integer.parseInt(sb.toString());

        int length = (int)Math.log10(num) + 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = length - 1; i >= 0; i--) {
            int digit = num % 10;
            num = num / 10;
            if (i == index) {
                continue;
            } else {
                stack.push(digit);
            }
        }

        int result = 0;
        for (int i = 0; !stack.isEmpty() ; i++) {
            result = result * 10 + stack.pop();
        }
        return result;


//        int length = (int)Math.log10(num) + 1;
//        int reversedResult = 0;
//        for (int i = 0; num != 0; i++) {
//            int digit = num % 10;
//            num = num / 10;
//            if (i == (length - index - 1)) {
//                continue;
//            } else {
//                reversedResult = reversedResult * 10 + digit;
//            }
//        }
//        int result = 0;
//        for (int i = 0; reversedResult != 0; i++) {
//            result = result * 10 + reversedResult % 10;
//            reversedResult = reversedResult / 10;
//        }
//
//        return result;
    }

    // index is from left to right, index starts from 0
    // input: 15958, 0, output: 1
    public int getDigit(int num, int index) {
        int length = (int) Math.log10(num) + 1;
        for (int i = 0; i < length - index - 1; i++) {
            num = num / 10;
        }
        return num % 10;
    }
}
