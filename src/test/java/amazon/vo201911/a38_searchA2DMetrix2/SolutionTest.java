package amazon.vo201911.a38_searchA2DMetrix2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void testSearchMatrix() throws Exception {
        int[][] grid = {{3, 4}};
        int target = 3;
        int expected = 1;

        assertEquals(this.solution.searchMatrix(grid, 3), expected);
    }
}
