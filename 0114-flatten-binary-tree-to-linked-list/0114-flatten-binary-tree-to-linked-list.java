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

    List<TreeNode> list = new ArrayList<>();

    public void flatten(TreeNode root) {
        preorder(root);

        for(int i = 0; i < list.size() - 1; i++){
            TreeNode curr = list.get(i);
            curr.left = null;
            curr.right = list.get(i + 1);
        }
    }

    public void preorder(TreeNode node){
        if(node == null) return;

        list.add(node);
        preorder(node.left);
        preorder(node.right);
    }
}