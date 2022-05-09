package tiktok.oa2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tiktok.oa2.Solution;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    tiktok.oa2.Solution solution;

    @BeforeMethod
    public void setUp() {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testNumberInfected () throws Exception {
        assertEquals(solution.getPrice(), 0);


    }
}