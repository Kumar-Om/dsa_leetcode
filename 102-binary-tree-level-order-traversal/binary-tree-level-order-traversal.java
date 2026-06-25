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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> res=new ArrayList<>();
        q.offer(root);
        if(root==null)return res;

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> temp=new ArrayList<>();
            while(level-- >0){
                TreeNode node=q.peek();
                temp.add(node.val);
                q.poll();
                
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            res.add(new ArrayList<>(temp));
        }
        return res;
    }
}