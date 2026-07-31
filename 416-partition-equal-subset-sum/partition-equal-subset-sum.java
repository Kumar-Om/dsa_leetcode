class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum%2==1)return false;
        
        return subsetSum(nums,nums.length,sum/2);
    }

    public boolean subsetSum(int nums[],int n,int sum){
        boolean dp[][]=new boolean[n+1][sum+1]; 
        //default boolean is already all false;

        dp[n][0]=true;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=sum;j++){
                if(nums[i]>j){
                    dp[i][j]=dp[i+1][j];
                }
                else{
                    dp[i][j]=dp[i+1][j-nums[i]] || dp[i+1][j];
                }
            }
        }
        return dp[0][sum];

    }
}