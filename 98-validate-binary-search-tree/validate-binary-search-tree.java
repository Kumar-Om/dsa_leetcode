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
        long min=Long.MIN_VALUE;
        long max=Long.MAX_VALUE;
        return valid(root,min,max);
        
    }

    public boolean valid(TreeNode curr,long min,long max){
        if(curr==null)return true;
        if(curr.val<=min||curr.val>=max)return false;
        return valid(curr.left,min,curr.val)&& valid(curr.right,curr.val,max);
    }

}



