package microsoft.oa3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    microsoft.oa3.Solution solution;

    @BeforeMethod
    public void setUp() {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testFindLargeNum () throws Exception {
        int result = solution.findLargeNum(155958);
        int expected = 15958;
        assertEquals(result, expected);
        int result2 = solution.findLargeNum(-5859);
        int expected2 = -589;
        assertEquals(result2, expected2);
        int result3 = solution.findLargeNum(154859);
        int expected3 = 15489;
        assertEquals(result3, expected3);
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testGetDigit() throws  Exception{
        int result1 = solution.getDigit(15958, 0);
        int expected1 = 1;
        assertEquals(result1, expected1);
        int result2 = solution.getDigit(15958, 4);
        int expected2 = 8;
        assertEquals(result2, expected2);
    }
}
