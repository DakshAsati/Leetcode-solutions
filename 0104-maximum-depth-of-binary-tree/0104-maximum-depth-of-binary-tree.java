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
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);


        int depth = 0;

        while(!q.isEmpty()){
            int curr = q.size();
            List<Integer> level = new ArrayList<>();


            for(int i = 0; i < curr; i++){
                TreeNode node = q.poll();
                level.add(node.val);


                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            depth++;
        }

        return depth;

        

        
    }
}