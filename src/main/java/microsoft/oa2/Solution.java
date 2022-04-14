package microsoft.oa2;

// https://leetcode.com/problems/sign-of-the-product-of-an-array/
//There is a function signFunc(x) that returns:
//
//        1 if x is positive.
//        -1 if x is negative.
//        0 if x is equal to 0.
//        You are given an integer array nums. Let product be the product of all values in the array nums.
//
//        Return signFunc(product).
public class Solution {

    protected static final boolean SOLUTION_DONE = true;

    public int arraySign(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result = 0;
                break;
            } else if (nums[i] < 0) {
                result *= -1;
            }
        }

        return result;
    }
}
