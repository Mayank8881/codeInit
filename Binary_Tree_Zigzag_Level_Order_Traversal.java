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
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return result;
        }
        q.add(root);
        boolean leftToRight=true;

        while(!q.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                // int idx=leftToRight ? i:(size-1-i);

                // arr.add(idx,node.val);
                if(leftToRight){
                    arr.add(node.val);
                }
                else{
                    arr.add(0,node.val);
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            leftToRight=!leftToRight;
            result.add(arr);
        }
        return result;
        
    }
}