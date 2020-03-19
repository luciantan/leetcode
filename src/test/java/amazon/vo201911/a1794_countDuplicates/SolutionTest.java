package amazon.vo201911.a1794_countDuplicates;

import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void testCountDuplicates() throws Exception{
        Integer[] input = {1, 2, 2, 3, 3, 3};
        LinkedList<Integer> nums = new LinkedList<Integer>();
        for (Integer i : input) {
            nums.add(i);
        }
        LinkedList<Integer> expected = new LinkedList<>();
        expected.add(2);
        expected.add(3);
        assertEquals(this.solution.CountDuplicates(nums), expected);
    }
}
