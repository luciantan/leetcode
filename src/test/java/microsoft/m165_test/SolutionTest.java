package microsoft.m165_test;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private microsoft.m165_test.Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testMergeTwoLists() throws Exception {
        int[] list1 = {1, 3, 5};
        int[] list2 = {2};
        ListNode listNode1 = ListNodeUtils.createListFromArray(list1);
        ListNode listNode2 = ListNodeUtils.createListFromArray(list2);

        ListNode result = this.solution.mergeTwoLists(listNode1, listNode2);

        String resultString = ListNodeUtils.listNodeToString(result);
        String expected = "[]";

        assertEquals(resultString, expected);
    }
}
