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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>arr=new ArrayList<>();
        inorder(arr,root);
        return BS(arr,0,arr.size()-1);
    }
    public void inorder(List<Integer> arr,TreeNode root){
        if(root==null)return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
    }

    public TreeNode BS(List<Integer>arr,int l,int r){
        if(l>r)return null;

        int  mid=(l+r)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=BS(arr,l,mid-1);
        root.right=BS(arr,mid+1,r);
        return root;
    }
}