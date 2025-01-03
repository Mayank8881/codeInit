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
        Queue<TreeNode> q=new LinkedList<>();
        int lcount=0,rcount=0;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                q.add(node.left);
                lcount++;
            }
            if(node.right!=null){
                q.add(node.right);
                rcount++;
            }

        }
        return Math.max(lcount,rcount)+1;
    }
}