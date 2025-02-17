/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // Return true instead of vis (vis is incorrectly declared)

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int currsize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < currsize; i++) {
                TreeNode node = q.poll(); // Fix: Declare node inside the loop

                if (node != null) { // Ensure node is not null before accessing children
                    level.add(node.val); // Add node value to the level list
                    q.add(node.left);
                    q.add(node.right);
                } else {
                    level.add(null); // Add null for missing nodes to check symmetry
                }
            }

            if (!isPalindrome(level)) return false; // Check if level is symmetric
        }

        return true;
    }


    private boolean isPalindrome(List<Integer> list) { // Helper function for symmetry check
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (list.get(left) != list.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
