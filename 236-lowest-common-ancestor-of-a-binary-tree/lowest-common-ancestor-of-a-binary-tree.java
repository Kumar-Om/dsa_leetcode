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
    TreeNode res=null;
    int total=0;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lcs(root,p,q);
        return res;
    }
    public int lcs(TreeNode root,TreeNode p,TreeNode q){
        if(root==null)return 0;
        int self=0;
        if(root==p || root==q){
            self=1;
        }

        int left=lcs(root.left,p,q);
        int right=lcs(root.right,p,q);
        total=self+left+right;

        if(total==2 && res==null){
            res=root;
        }
        return total;

    }
}