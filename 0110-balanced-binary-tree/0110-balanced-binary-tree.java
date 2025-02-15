import java.util.*;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true; // An empty tree is balanced

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            
            // Check height difference
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (Math.abs(leftHeight - rightHeight) > 1) {
                return false; // Tree is unbalanced
            }

            // Continue traversal
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return true; // Tree is balanced
    }

    // Helper function to calculate height of a tree
    private int height(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
