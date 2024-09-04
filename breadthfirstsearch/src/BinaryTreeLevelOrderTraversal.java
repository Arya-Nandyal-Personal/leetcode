package breadthfirstsearch.src;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lvOrder = new ArrayList<>();
        if(root == null) return lvOrder;
        Queue<TreeNode> pq = new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()) {
            List<Integer> depth = new ArrayList<>();
            int size = pq.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = pq.remove();
                depth.add(node.val);
                if(node.left != null) pq.add(node.left);
                if(node.right != null) pq.add(node.right);
            }
            lvOrder.add(depth);
        }
        return lvOrder;
    }
}


