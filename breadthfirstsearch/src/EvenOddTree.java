package breadthfirstsearch.src;

import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        int currLevel = 0;
        if(root == null) return true;
        Queue<TreeNode> dfs = new LinkedList<>();
        dfs.add(root);
        while(!dfs.isEmpty()) {
            int size = dfs.size();
            int evenVal = Integer.MIN_VALUE;
            int oddVal = Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = dfs.remove();
                if(currLevel % 2 == 1) {
                    if(node.val % 2 == 1 || node.val >= oddVal) return false;
                    oddVal = node.val;
                }else {
                    if(node.val % 2 != 1 || node.val <= evenVal) return false;
                    evenVal = node.val;
                }
                if(node.left != null) dfs.add(node.left);
                if(node.right != null) dfs.add(node.right);
            }
            currLevel++;
        }
        return true;
    }
}
