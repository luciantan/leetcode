package amazon.oa2020.a423_validParentheses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testIsValidParentheses() throws Exception {
        String input = "([)]";
        boolean expected = false;
        assertEquals(this.solution.isValidParentheses(input), expected);
    }
}
