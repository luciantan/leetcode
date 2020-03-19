package amazon.oa2020.a200_longestPalindromicSubstring;

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
    public void testLongestPalindrom() throws Exception {
        String input = "abcdzdcab";
        String expected = "cdzdc";

        assertEquals(this.solution.longestPalindrome(input), expected);
    }
}