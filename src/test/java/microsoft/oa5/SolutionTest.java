package microsoft.oa5;

import microsoft.oa5.Solution;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    microsoft.oa5.Solution solution;

    @BeforeMethod
    public void setUp(){
        solution = new microsoft.oa5.Solution();
    }

    @Test(enabled= Solution.SOLUTION_DONE)
    public void testMaxNumberOfFamilies() {
        int[][] reservedSeats = new int[][] {{2,1}, {1,8}, {2,6}};
        int result3 = solution.maxNumberOfFamilies(2, reservedSeats);
        int expected3 = 2;
        assertEquals(result3, expected3);
    }

    @Test(enabled= Solution.SOLUTION_DONE)
    public void testMaxNumberOfFamilies2() {
        int[][] reservedSeats = new int[][] {{1,2}, {1,3}, {1,8}, {2, 6}, {3,1}, {3, 10}};
        int result = solution.maxNumberOfFamilies(3, reservedSeats);
        int expected = 4;
        assertEquals(result, expected);
    }
}
