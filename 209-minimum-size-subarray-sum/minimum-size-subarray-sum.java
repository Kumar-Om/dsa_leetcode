class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int l=0,r=0;
        int sum=0,n=nums.length;
        while(r<n){
            sum+=nums[r];
            while(sum>=target){
                mini=Math.min(mini,r-l+1);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return mini==(Integer.MAX_VALUE)?0:mini;
    }
}