class Solution {
    int dp[][];
    public int rob(int[] nums) {
        int n=nums.length;
        dp
        =new int[n][2];
        for(int i=0;i<n;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }

        return rob(nums,n,0,1,dp);
    }

    public int rob(int nums[],int n,int i,int free,int dp[][]){
        if(i==n)return 0;

        if(dp[i][free]!=-1){
            return dp[i][free];
        }

        if(free==0){
            dp[i][free]=rob(nums,n,i+1,1,dp);
            return dp[i][free];
        }
        else{
            int c1=rob(nums,n,i+1,1,dp);
            int c2=nums[i]+rob(nums,n,i+1,0,dp);
            dp[i][free]=Math.max(c1,c2);
            return dp[i][free];
        }
    }
}