class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        inorder(root1,l1);
        inorder(root2,l2);
        return merge(l1,l2);
    }
    public void inorder(TreeNode curr, List<Integer> l){
        if(curr==null) return;
        inorder(curr.left, l);
        l.add(curr.val);
        inorder(curr.right,l);
    }
    public List merge(List<Integer> l1, List<Integer> l2){
        List<Integer> res=new ArrayList<>();
        int i=0,j=0;
        while(i<l1.size() && j<l2.size()){
            if(l1.get(i) <= l2.get(j)){
                res.add(l1.get(i));
                i++;
            }
            else{
                res.add(l2.get(j));
                j++;
            }
        }
        while(i<l1.size()) res.add(l1.get(i++));
        while(j<l2.size()) res.add(l2.get(j++));
        return res;
    }
}