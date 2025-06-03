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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        List<Integer>arr=new ArrayList<>();
        inorder(root1,pq);
        inorder(root2,pq);
        while(!pq.isEmpty()){

            arr.add(pq.poll());
        }
        return arr;
    }

    public void inorder(TreeNode root,PriorityQueue<Integer>pq){
        if(root==null)return;

        inorder(root.left,pq);
        pq.add(root.val);
        inorder(root.right,pq);
    }
}