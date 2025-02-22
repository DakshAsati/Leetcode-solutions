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
    public TreeNode insertIntoBST(TreeNode root, int val) {

 TreeNode node = new TreeNode(val);

        if(root == null){
           return node;
            

        }
        TreeNode temp = root;

        while(true){
            if(temp.val == val)
            return null;


            if(temp.val > val){
                if(temp.left == null){
                    temp.left = node;
                    break;

                }
                temp = temp.left;

            }else{
                if(temp.right == null){
                    temp.right = node;
                    break;
                }
                temp = temp.right;
            }

        }
            return root;

        
    }
}


// class Solution {
//     public TreeNode insertIntoBST(TreeNode root, int val) {
//         TreeNode node = new TreeNode(val);

//         if (root == null) {
//             return node;  // If tree is empty, return new node as root.
//         }

//         TreeNode temp = root;

//         while (true) {
//             if (temp.val > val) {  // Move left if value is smaller
//                 if (temp.left == null) {
//                     temp.left = node;
//                     break;  // Insertion complete
//                 }
//                 temp = temp.left;
//             } else {  // Move right if value is greater
//                 if (temp.right == null) {
//                     temp.right = node;
//                     break;  // Insertion complete
//                 }
//                 temp = temp.right;
//             }
//         }
        
//         return root;  // Return the modified root
//     }
// }

