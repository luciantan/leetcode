package amazon.mostFrequent50.a042_trappingRainWater;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

public class Solution {

    protected static final boolean SOLUTION_DONE = false;

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;

        if (left >= right) {
            return result;
        }

        int leftHeight = height[left];
        int rightHeight = height[right];
        while (left < right) {
            if (leftHeight < rightHeight) {
                left++;
                if (height[left] < leftHeight) {
                    result += leftHeight - height[left];
                } else {
                    leftHeight = height[left];
                }
            } else {
                right--;
                if (height[right] < rightHeight) {
                    result += rightHeight - height[right];
                } else {
                    rightHeight = height[right];
                }
            }
        }

        return result;
    }
}
