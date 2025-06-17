class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length];
        List<Integer>temp=new ArrayList<>();
        permutation(nums,used,temp);
        return res;
    }
    public void permutation(int[]nums,boolean used[],List<Integer>temp){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]==false){
                temp.add(nums[i]);
                used[i]=true;

                permutation(nums,used,temp);

                temp.remove(temp.size()-1);
                used[i]=false;
            }
        }
    }
}