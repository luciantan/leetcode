package microsoft.oa2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private microsoft.oa2.Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testArraySigh() throws Exception{
        int[] nums = new int[]{-1,-2,-3,-4,3,2,1};
        int result = solution.arraySign(nums);
        int expected = 1;
        assertEquals(result, expected);
    }
}
