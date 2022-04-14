package microsoft.oa1;

import cn.hjmao.utils.tree.TreeNode;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
// Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
// Return the number of good nodes in the binary tree.
public class Solution {

    protected static final boolean SOLUTION_DONE = true;

    private int count;

    public int goodNodes(TreeNode root) {

        System.out.println("tanlun");

        dfs(root, Integer.MIN_VALUE);
        return count;
    }

    private void dfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        dfs(root.left, max);
        dfs(root.right, max);
    }
}
