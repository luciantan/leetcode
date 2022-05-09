package tiktok.oa1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    tiktok.oa1.Solution solution;

    @BeforeMethod
    public void setUp() {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testNumberInfected () throws Exception {
        assertEquals(solution.numberInfected(6, new int[] {2,  4}), 6);
        assertEquals(solution.numberInfected(6, new int[] {0}), 1);
        assertEquals(solution.numberInfected(6, new int[] {0, 5}), 4);

    }
}
