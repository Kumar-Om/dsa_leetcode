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
    List<String>res=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder temp=new StringBuilder();
        sol(root,temp);
        return res;
    }
    public void sol(TreeNode curr,StringBuilder temp){
        int len=temp.length();
        //action
        temp.append(curr.val);
        //goal
        if(curr.left==null && curr.right==null){
            res.add(temp.toString());
        }
        else{
            temp.append("->");

            //recurr
            if(curr.left!=null)sol(curr.left,temp);
            if(curr.right!=null)sol(curr.right,temp);
        }

        //undo
        temp.setLength(len);

    }
}




