class Solution {
    public int uniquePaths(int row, int col) {
        int dp[][]=new int[row+1][col+1];
        dp[row-1][col-1]=1;
        for(int i=0;i<=row;i++)dp[i][col]=0;
        for(int j=0;j<=col;j++)dp[row][j]=0;

        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(i==row-1 && j==col-1)continue;
                dp[i][j]=dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}