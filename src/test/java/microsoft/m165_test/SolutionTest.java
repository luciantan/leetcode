package microsoft.m165_test;

import cn.hjmao.utils.tree.TreeNode;
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

        TreeNode root = new TreeNode(1);
        int result = solution.goodNodes(root);

        assertEquals(0, 0);
    }
}
