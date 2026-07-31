class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++)Arrays.fill(dp[i],-1);
        for(int i=0;i<=n;i++)dp[n][i]=0;

        return lis(nums,nums.length,0,-1,dp);
    }
    public int lis(int nums[],int n,int i,int prev,int dp[][]){
        if(i==n)return 0;

        if(dp[i][prev+1]!=-1){
            return dp[i][prev+1];
        }

        if(prev==-1 || nums[i]>nums[prev]){
            int c1= 1+lis(nums,n,i+1,i,dp);
            int c2=lis(nums,n,i+1,prev,dp);
            return dp[i][prev+1]= Math.max(c1,c2);
        }
        else{
            return dp[i][prev+1]= lis(nums,n,i+1,prev,dp);
        }
    }
}