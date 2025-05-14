/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null || p==root || q==root) return root;

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null) return right;
        if(right==null) return left;
        else{
            return root;
        }



        // List<TreeNode> plist=new ArrayList<>();
        // List<TreeNode> qlist=new ArrayList<>();

        // trackPath(root,p,plist);
        // trackPath(root,q,qlist);

        // int i=0;
        // while(i<plist.size() && i<qlist.size() && plist.get(i)==qlist.get(i)){
        //     i++;
        // }

        // return plist.get(i-1);


    }

    private boolean trackPath(TreeNode root,TreeNode x,List<TreeNode> path){
        if(root==null) return false;

        path.add(root);
        if(root.val==x.val) return true;

        if(trackPath(root.left,x,path) || trackPath(root.right,x,path)){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
}