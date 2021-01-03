package amazon.mostFrequent50.a238_productOfArrayExceptSelf;

import java.util.Arrays;

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    public int[] productExceptSelf(int[] nums) {
        int[] before = new int[nums.length];
        int[] after = new int[nums.length];
        Arrays.fill(before, 1);
        Arrays.fill(after, 1);
        before[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            before[i + 1] = nums[i + 1] * before[i];

        }
        System.out.println(Arrays.toString(before));
        after[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0; i--) {
            after[i - 1] = nums[i - 1] * after[i];
        }
        System.out.println(Arrays.toString(after));

        int[] result = new int[nums.length];
        result[0] = after[1];
        result[nums.length - 1] = before[nums.length - 2];
        for (int i = 1; i < nums.length - 1; i++) {
            result[i] = before[i - 1] * after[i + 1];
        }
        return result;
    }
}
