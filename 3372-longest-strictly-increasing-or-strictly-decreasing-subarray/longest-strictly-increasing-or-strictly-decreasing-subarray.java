class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1,dec=1,maxi=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                inc++;
                dec=1;

            }
            else if(nums[i+1]<nums[i]){
                inc=1;dec++;
            }
            else{
                inc=1;dec=1;
            }
            maxi=Math.max(maxi,Math.max(inc,dec));
        }
        return maxi;
    }
}