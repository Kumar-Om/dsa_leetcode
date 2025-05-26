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
    boolean flag= false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum=0;
        preorder(root,targetSum,sum);
        return flag;
    }

    public void preorder(TreeNode currNode,int target,int sum){
        if(currNode==null)return;
        sum=sum+currNode.val;

        if(currNode.left==null && currNode.right==null && sum==target){
            flag=true;
            return;
        }

        preorder(currNode.left,target,sum);
        preorder(currNode.right,target,sum);
    }
}