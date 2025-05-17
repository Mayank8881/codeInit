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
    int i=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstSearch(preorder,Integer.MAX_VALUE);
    }
    public TreeNode bstSearch(int A[] ,int limit){
        if(i==A.length ||  A[i] > limit) return null;

        TreeNode root=new TreeNode(A[i++]);
        root.left=bstSearch(A,root.val);
        root.right=bstSearch(A,limit);

        return root;
    }
}