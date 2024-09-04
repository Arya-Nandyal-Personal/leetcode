package breadthfirstsearch.src;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public int sum(TreeNode root) {
        if(root == null) return -1;
        Queue<TreeNode> dfs = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int minDepth = 0;
        int level = 0;
        dfs.add(root);
        while(!dfs.isEmpty()) {
            int size = dfs.size();
            int depthSum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = dfs.remove();
                depthSum += node.val;
                if(node.left != null) dfs.add(node.left);
                if(node.right != null) dfs.add(node.right);
            }
            level++;
            if(depthSum > maxSum) minDepth = level;
            maxSum = Math.max(depthSum, maxSum);
        }
        return minDepth;
    }
}
