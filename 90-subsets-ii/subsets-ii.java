class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subsetsWithDup(nums,res,temp,0,n);
        return res;
    }
    public void subsetsWithDup(int nums[],List<List<Integer>> res,List<Integer> temp,int idx,int n){
        res.add(new ArrayList<>(temp));

        for(int i=idx;i<n;i++){
            if(i>idx && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            subsetsWithDup(nums,res,temp,i+1,n);
            temp.remove(temp.size()-1);
           
        }
    }
}