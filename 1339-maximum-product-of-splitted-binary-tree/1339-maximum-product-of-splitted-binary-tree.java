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
    long max = 0;
    long totalSum = 0;
    static final int MOD = 1_000_000_007;
    public int maxProduct(TreeNode root) {

        totalSum =  dfsTotal(root);

        dfsSubTree(root);


        return (int)(max % MOD);

        
    }

    private long dfsTotal(TreeNode node){
        if(node == null) return 0;
        return node.val + dfsTotal(node.left) + dfsTotal(node.right);
    }

    private long dfsSubTree(TreeNode node){
        if(node == null) return 0;

        long left = dfsSubTree(node.left);
        long right = dfsSubTree(node.right);

        long currSum = node.val + left + right;


        long product = currSum * (totalSum - currSum);
        max = Math.max(max, product);

        return currSum;
    }
    
}

// maxproduct method
// total sum method
// and dfs method