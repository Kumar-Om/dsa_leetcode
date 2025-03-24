class Solution {
    public int longestOnes(int[] nums, int k) {
        int c=0,l=0,r=0,n=nums.length,maxi=0;
        while(r<n){
            if(nums[r]==0)c++;
            if(c>k){
                if(nums[l]==0)c--;
                l++;
            }
            if(c<=k){
                maxi=Math.max(maxi,r-l+1);
            }
            
            r++;
        }
        return maxi;
    }
}