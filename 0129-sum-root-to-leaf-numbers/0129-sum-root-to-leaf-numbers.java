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

 
 
   int sum = 0;
    public int sumNumbers(TreeNode root) {

 
        sum(root,0);
        return sum;

    }
       void  sum(TreeNode node, int res){
        if(node == null) return;

        res = res* 10 + node.val;

        if(node.left == null && node.right == null){
            sum += res;
        }

        sum(node.left,res);
        sum(node.right, res);


       


        
    }
}