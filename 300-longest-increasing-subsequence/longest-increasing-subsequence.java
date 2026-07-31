class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];

        for(int i=0;i<n;i++){
            res[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    res[i]=Math.max(res[i],1+res[j]);
                }
            }
        }
        int maxi=0;
        for(int i=0;i<n;i++)maxi=Math.max(maxi,res[i]);
        return maxi;
    }
}