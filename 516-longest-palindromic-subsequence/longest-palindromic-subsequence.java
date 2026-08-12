class Solution {
    public int lcs(String s1,String s2,int n,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++)dp[i][m]=0;
        for(int i=0;i<m;i++)dp[n][i]=0;

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }
        return dp[0][0];


    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder s2=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            s2.append(s.charAt(i));
        }
        return lcs(s,s2.toString(),s.length(),s2.length());
    }
}