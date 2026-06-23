class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        subsets(nums,0,temp,res);
        return res;
    }

    public void subsets(int nums[],int idx,List<Integer> temp,List<List<Integer>> res){
        if(idx==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        subsets(nums,idx+1,temp,res);
        temp.remove(temp.size()-1);
        subsets(nums,idx+1,temp,res);
    }
}