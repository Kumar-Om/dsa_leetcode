class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return solve(nums,goal)-solve(nums,goal-1);

    }
    public int solve(int nums[],int goal){
        int l=0,r=0,sum=0,count=0;
        if(goal<0)return 0;
        while(r<nums.length){
            sum=sum+nums[r];
            if(sum<=goal){
                count+=r-l+1;
            }
            else{
                while(sum>goal){
                    sum-=nums[l];
                    l++;
                }
                count+=r-l+1;
            }
            r++;
        }
        return count;
    }
}