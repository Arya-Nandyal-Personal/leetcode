package depthfirstsearch;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        return toLeafSum(root, targetSum);
    }

    public static boolean toLeafSum(TreeNode node, int sum) {
        if(node == null) return false;
        sum -= node.val;
        if(sum == 0 && (node.right == null && node.left == null)) return true;
        return toLeafSum(node.left, sum) || toLeafSum(node.right, sum);

    }
}
