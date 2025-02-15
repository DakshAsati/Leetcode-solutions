import java.util.*;

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true; // An empty tree is balanced

        // Function to check height and balance
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode node) {
        if (node == null) return 0; // Base case: height of an empty subtree is 0

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1; // If left subtree is unbalanced, propagate -1

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1; // If right subtree is unbalanced, propagate -1

        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Unbalanced tree

        return Math.max(leftHeight, rightHeight) + 1; // Return tree height
    }
}
