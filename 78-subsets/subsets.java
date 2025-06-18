class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        solve(nums,temp,0);
        return res;
    }
    public void solve(int[]nums,List<Integer>temp,int i){
        if(i==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[i]);
        solve(nums,temp,i+1);
        temp.remove(temp.size()-1);
        solve(nums,temp,i+1);
    }
}