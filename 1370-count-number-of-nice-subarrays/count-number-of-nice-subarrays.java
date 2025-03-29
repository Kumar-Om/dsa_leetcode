class Solution {
    public int f(int[] nums,int k){
        //1 1 0 1 1 0
        int l=0,r=0,s=0,n=nums.length,ans=0;
        while(r<n){
            s=s+(nums[r]%2);
            while(s>k){
                s-=nums[l]%2;
                l++;
            }
            ans+=r-l+1;
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
    }
}