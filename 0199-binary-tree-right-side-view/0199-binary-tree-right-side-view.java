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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int currsize = q.size();
            int lastValue = -1; 
            for(int i = 0; i < currsize; i++){
                TreeNode node = q.poll();
                lastValue = node.val;  

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            result.add(lastValue); 
        }

        return result;
    }
}
