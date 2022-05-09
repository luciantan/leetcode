package tiktok.oa3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    tiktok.oa3.Solution solution;

    @BeforeMethod
    public void setUp() {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testNumberInfected () throws Exception {

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(5);
        List<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(5);
        list4.add(6);
        List<Integer> list5 = new ArrayList<>();
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(6);
        List<Integer> list6 = new ArrayList<>();
        list6.add(4);
        list6.add(5);
        graph.put(1, list1);
        graph.put(2, list2);
        graph.put(3, list3);
        graph.put(4, list4);
        graph.put(5, list5);
        graph.put(6, list6);
        assertEquals(solution.getMaxDistance(graph), 1);


    }
}
