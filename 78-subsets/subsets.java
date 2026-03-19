class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subsets(res,temp,nums,0,nums.length);
        return res;
    }
    public void subsets(List<List<Integer>> res,List<Integer> temp,int nums[],int i,int n){
        if(i==n){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        subsets(res,temp,nums,i+1,n);
        temp.remove(temp.size()-1);
        subsets(res,temp,nums,i+1,n);
    }
}