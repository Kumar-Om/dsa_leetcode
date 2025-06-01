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
    TreeNode prev,f,s;
    public void recoverTree(TreeNode root) {
        if(root==null)return;
        inorder(root);
        int temp=f.val;
        f.val=s.val;
        s.val=temp;
    }

    public void inorder(TreeNode curr){
        if(curr==null)return;
        inorder(curr.left);
        if(prev!=null && prev.val>curr.val && f==null){
            f=prev;
        }
        if(prev!=null && prev.val>curr.val && f!=null){
            s=curr;
        }
        prev=curr;
        inorder(curr.right);
    }
}