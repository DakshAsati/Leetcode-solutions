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

    private int maxSum = Integer.MIN_VALUE;


    public int maxPathSum(TreeNode root) {

        maxSumHelper(root);
        return maxSum;        
    }

    private int maxSumHelper(TreeNode node){
        if(node == null) return 0;


        int leftSum = Math.max(maxSumHelper(node.left), 0);
        int rightSum  = Math.max(maxSumHelper(node.right), 0);

        int currentpathSum = node.val + leftSum + rightSum;

        maxSum = Math.max(maxSum, currentpathSum);

        return node.val + Math.max(leftSum , rightSum);



    }
}