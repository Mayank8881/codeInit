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
    int sum=0;
    int path(TreeNode root){
        if (root == null) {
            return 0;
        }
        int left=Math.max(0,path(root.left));
        int right=Math.max(0,path(root.right));

        sum = Math.max(sum, left + right+root.val);

        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        // int sum[]=new int[1];
        // sum[0]=Integer.MIN_VALUE;
        int result=path(root);
        return sum;
    }
}