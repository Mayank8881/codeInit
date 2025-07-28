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

class Pair{
    int data;
    TreeNode node;
    Pair(TreeNode node,int data){
        this.node=node;
        this.data=data;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        int res=0;

        q.add(new Pair(root,0));

        while(!q.isEmpty()){
            int size=q.size();
            int first=0,last=0;
            int init=q.peek().data;

            for(int i=0;i<size;i++){
                int curr_data=q.peek().data-init;
                TreeNode node=q.peek().node;
                q.poll();

                if(i==0) first=curr_data;
                if(i==size-1) last=curr_data;

                if(node.left!=null) q.add(new Pair(node.left,2*curr_data+1));
                if(node.right!=null) q.add(new Pair(node.right,2*curr_data+2));

            }
            res=Math.max(res,last-first+1);
        }
        return res;
    }
}