package com.leetcode.snippets.a000MyPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17/01/2017.
 */
public class SolutionTest {
    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test (enabled = Solution.SOLUTION_DONE)
    public void testTwoSum() throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};

        assertEquals(this.solution.twoSum(nums, target), expected);
    }
}
