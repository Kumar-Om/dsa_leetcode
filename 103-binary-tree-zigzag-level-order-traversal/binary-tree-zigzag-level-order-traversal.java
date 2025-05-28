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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        List<List<Integer>> zigzag=new ArrayList<>();
        boolean flag=false;

        if(root==null)return zigzag;
        q.offer(root);

        while(!q.isEmpty()){
            List<Integer>level=new ArrayList<>();
            Stack<Integer>st=new Stack<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                
                if(flag==true){
                    st.add(curr.val);
                }
                else{
                    level.add(curr.val);
                }

                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            flag=!flag;

            while(!st.isEmpty()){
                level.add(st.pop());
            }
            zigzag.add(level);
        }
        return zigzag;
    }
}




