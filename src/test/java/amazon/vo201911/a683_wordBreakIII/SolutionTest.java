package amazon.vo201911.a683_wordBreakIII;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test
    public void testWordBreak3() throws Exception {
        String input = "CatMat";
        Set<String> dict = new HashSet<>();
        String[] dictStrings = {"Cat", "Mat", "Ca", "tM", "at", "C", "Dog", "og", "Do"};
        for (String s : dictStrings) {
            dict.add(s);
        }
        int expected = 3;

        assertEquals(this.solution.wordBreak3(input, dict), expected);
    }

}
