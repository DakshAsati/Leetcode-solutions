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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
   List<List<Integer>> list = new  ArrayList<>();
        if(root == null) return list;
       boolean lefttoright = true;
       Queue<TreeNode> q = new LinkedList<>();
       q.add(root);


        while(!q.isEmpty()){
            int size = q.size();
            
        List<Integer> dq = new ArrayList<>();
        

        for(int i = 0; i < size; i++){
            
    
            TreeNode temp = q.poll();

            if(lefttoright){
                dq.add(temp.val);
             
            }else{
                dq.add(0,temp.val);
            }

            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);

        }
            list.add(dq);


            lefttoright =  !lefttoright;
            

  


        }

        return list;

        }

        
        

       



        

}