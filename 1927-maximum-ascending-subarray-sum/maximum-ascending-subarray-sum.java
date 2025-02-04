class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=0,maxi=0,i=0;
        for( i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                s+=nums[i];
            }
            else{
                s+=nums[i];
                maxi=Math.max(maxi,s);
                s=0;
            }
        }
        s+=nums[i];
        maxi=Math.max(maxi,s);
        return maxi;
    }
}