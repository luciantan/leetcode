package amazon.oa2020;

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
    public void testZombie() throws Exception {
        int[][] grid = {{0,1,2,0,0},{1,0,0,2,1},{0,1,0,0,0}};
        int expected = 2;

        assertEquals(this.solution.zombie(grid), expected);
    }
}