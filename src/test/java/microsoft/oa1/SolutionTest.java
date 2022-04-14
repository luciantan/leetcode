package microsoft.oa1;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private microsoft.oa1.Solution solution;

    @BeforeMethod
    public void setUp() throws Exception {
        this.solution = new Solution();
    }

    @Test(enabled = Solution.SOLUTION_DONE)
    public void testGoodNodes() throws Exception {

        Integer[] treeArray = {3,1,4,3,null,1,5};
        TreeNode root = TreeNodeUtils.fromArray(treeArray);
        int expected = 4;

        int result = solution.goodNodes(root);

        assertEquals(result, expected);
    }

}
