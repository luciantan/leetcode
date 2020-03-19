package amazon.oa2020.a1181_diameterOfBinaryTree;
import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
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
        Integer[] treeArray = {1,2,3,4,5};
        TreeNode root = TreeNodeUtils.fromArray(treeArray);
        int expected = 3;

        assertEquals(this.solution.diameterOfBinaryTree(root), expected);
    }
}
