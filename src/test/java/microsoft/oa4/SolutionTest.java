package microsoft.oa4;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    microsoft.oa4.Solution solution;

    @BeforeMethod
    public void setUp(){
        solution = new Solution();
    }

    @Test(enabled=Solution.SOLUTION_DONE)
    public void testFindLargeNum() {
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
}
