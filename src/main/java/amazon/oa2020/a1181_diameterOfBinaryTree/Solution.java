package amazon.oa2020.a1181_diameterOfBinaryTree;

import cn.hjmao.utils.tree.TreeNode;

public class Solution {
    protected static final boolean SOLUTION_DONE = true;

    int max = 0;
    /**
     * @param root: a root of binary tree
     * @return: return a integer
     */
    public int diameterOfBinaryTree(TreeNode root) {
        // write your code here
        maxDepth(root);
        return max;
    }

    public int maxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = maxDepth(node.left);
        int right = maxDepth(node.right);

        max = Math.max(max, right + left);
        return Math.max(left + 1, right + 1);
    }
}
