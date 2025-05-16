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
    public boolean isValidBST(TreeNode root) {
        return checkBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    boolean checkBST(TreeNode root,int mini,int maxi){
        if(root==null) return true;
        if(root.val<=mini || root.val>=maxi) return false;

        boolean left=checkBST(root.left,mini,root.val);
        boolean right=checkBST(root.right,root.val,maxi);

        return left&&right;
    }
}