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

 import java.util.*;

class Solution {
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int currSize = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < currSize; i++) {  
                TreeNode node = q.poll();
                if (leftToRight) {
                    level.add(node.val);
                } else {
                    level.add(0, node.val); 
                }

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
            result.add(level);
            leftToRight = !leftToRight; 
        }
        return result;
    }
}