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
    int p1=0,p2=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        TreeNode curr=new TreeNode(preorder[p1]);
        p1++;

        if(curr.val!=postorder[p2]){
            curr.left=constructFromPrePost(preorder,postorder);
        }
        if(curr.val!=postorder[p2]){
            curr.right=constructFromPrePost(preorder,postorder);
        }
        p2++;
        return curr;
    }
}