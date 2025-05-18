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
    int same(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return 0;
        }
        if(p==null || q==null || p.val!=q.val){
            return -1;
        }

        int left=same(p.left,q.left);
        int right=same(p.right,q.right);

        if(left==-1 || right==-1) {
            return -1;
        }
        return 1;

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
      return same(p,q)!=-1;
    }
}