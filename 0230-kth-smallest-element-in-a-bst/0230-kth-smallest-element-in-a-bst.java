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

     List<Integer> values = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {

       
        /*

        Inorder -> Left, Root, right
        postorder -> L,R root
        preorder -> root, Left, right

        */

            inorder(root);
           return values.get(k - 1);

        
    }

    public void inorder(TreeNode node){
        if(node  == null){
            return;
        }

        inorder(node.left);
        values.add(node.val);
        inorder(node.right);
    }
}