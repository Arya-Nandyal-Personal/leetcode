package breadthfirstsearch.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AvgLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        if(root == null) return avg;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            int size = nodes.size();
            double depthAvg = 0.0;
            for(int i = 0; i < size; i++) {
                TreeNode node = nodes.remove();
                depthAvg += node.val;
                if(node.left != null) nodes.add(node.left);
                if(node.right != null) nodes.add(node.right);
            }
            depthAvg /= size;
            avg.add(depthAvg);
        }
        return avg;
    }
}
