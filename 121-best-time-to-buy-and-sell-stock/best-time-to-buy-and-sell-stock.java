class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length,k=2;
        int dp[][]=new int[n+1][k+1];
        for(int i=0;i<=k;i++)dp[n][i]=0;
        for(int i=0;i<=n;i++)dp[i][0]=0;

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=k;j++){
                if(j==2){
                    dp[i][j]=Math.max(dp[i+1][j-1]-prices[i],dp[i+1][j]);
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j-1]+prices[i],dp[i+1][j]);
                }
            }
        }

        return dp[0][k];

    }
}