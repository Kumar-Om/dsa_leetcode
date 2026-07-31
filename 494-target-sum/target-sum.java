class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(Math.abs(target)>sum)return 0;
        if((sum+target)%2==1)return 0;
        int n=nums.length;

        //find positive subset sum to use as target
        int pos= (sum+target)/2;
        

        //count subsetSum code
        int dp[][]=new int[n+1][pos+1];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        for(int i=0;i<pos;i++)dp[n][i]=0;
        dp[n][0]=1;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=pos;j++){
                if(nums[i]>j){
                    dp[i][j]=dp[i+1][j];
                }
                else{
                    dp[i][j]=dp[i+1][j-nums[i]] +dp[i+1][j];
                }
            }
        }
        return dp[0][pos];

    }
}

















