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
    // int sum=Integer.MIN_VALUE;
    int path(TreeNode root,int sum[]){
        if (root == null) {
            return 0;
        }
        int left=Math.max(0,path(root.left,sum));
        int right=Math.max(0,path(root.right,sum));

        sum[0] = Math.max(sum[0], left + right+root.val);

        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int sum[]=new int[1];
        sum[0]=Integer.MIN_VALUE;
        int result=path(root,sum);
        return sum[0];
    }
}