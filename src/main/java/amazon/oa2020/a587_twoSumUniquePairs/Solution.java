package amazon.oa2020.a587_twoSumUniquePairs;

//587. Two Sum - Unique pairs
//        中文English
//        Given an array of integers, find how many unique pairs in the array such that their sum is equal to a specific target number.
//        Please return the number of pairs.
//
//        Example
//        Example 1:
//
//        Input: nums = [1,1,2,45,46,46], target = 47
//        Output: 2
//        Explanation:
//
//        1 + 46 = 47
//        2 + 45 = 47
//
//        Example 2:
//
//        Input: nums = [1,1], target = 2
//        Output: 1
//        Explanation:
//        1 + 1 = 2

import java.util.Arrays;

public class Solution {
    protected static final boolean SOLUTION_DONE = true;
    public int twoSum6(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length < 2)
            return 0;

        Arrays.sort(nums);
        int cnt = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int v = nums[left] + nums[right];
            if (v == target) {
                cnt ++;
                left ++;
                right --;
                while (left < right && nums[right] == nums[right + 1])
                    right --;
                while (left < right && nums[left] == nums[left - 1])
                    left ++;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return cnt;
    }
}
