package amazon.oa2020.a471_topKFrequentWords;

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
        String[] words = {"yes", "lint", "code",
                "yes", "code", "baby",
                "you", "baby", "chrome",
                "safari", "lint", "code",
                "body", "lint", "code"};
        int k = 3;
        String[] expected = {"code", "lint", "baby"};
        assertEquals(this.solution.topKFrequentWords(words, 3), expected);
    }
}