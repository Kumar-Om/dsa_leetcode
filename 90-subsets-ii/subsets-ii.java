class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,res,temp,0,nums.length);
        return res;
    }
    public void subset(int nums[],List<List<Integer>> res,List<Integer> temp,int idx,int n){
        res.add(new ArrayList<>(temp));

        for(int i=idx;i<n;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subset(nums,res,temp,i+1,n);
            temp.remove(temp.size()-1);
        }
    }
}