package depthfirstsearch;

import breadthfirstsearch.src.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class CountGoodNodesInBinaryTree {
    private static int numGoodNodes;
    public int goodNodes(TreeNode root) {
        numGoodNodes = 0;
        dfs(root, root.val);
        return numGoodNodes;
    }
    public static void dfs(TreeNode node, int minVal) {
        if(node == null) return;
        if(node.val >= minVal) {
            System.out.println(node.val + " " + minVal + " " + numGoodNodes);
            numGoodNodes++;
            minVal = node.val;
        }
        dfs(node.left, minVal);
        dfs(node.right, minVal);
    }
}
