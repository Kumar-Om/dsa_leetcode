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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        if(root!=null)q.offer(root);
        while(!q.isEmpty()){
            ArrayList<Integer>arr=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode currNode=q.poll();
                arr.add(currNode.val);
                if(currNode.left!=null){
                    q.offer(currNode.left);
                }
                if(currNode.right!=null){
                    q.offer(currNode.right);
                }
            }
            res.add(arr);
        }
        return res;
    }
}