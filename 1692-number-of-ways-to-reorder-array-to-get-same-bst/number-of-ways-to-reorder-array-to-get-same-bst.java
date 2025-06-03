class Solution {
    int mod=(int)1e9+7;
    int[][] pascal;
    public int numOfWays(int[] nums) {
        int n=nums.length;
        pascal=new int[n][n];
        pascal[0][0]=1;
        for(int i=1;i<n;i++){
            pascal[i][0]=1;
            for(int j=1;j<=i;j++){
                pascal[i][j]=(pascal[i-1][j]+pascal[i-1][j-1])% mod;
            }
        }

        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }

        return (int)(((long)preorder(arr) - 1 + mod) % mod);

    }

    public int preorder(List<Integer>arr){
        if(arr.size()<2)return 1;
        int n=arr.size(),root=arr.get(0);
        List<Integer>left=new ArrayList<>();
        List<Integer>right=new ArrayList<>();

        for(int i=1;i<n;i++){
            if(arr.get(i)>root){
                right.add(arr.get(i));
            }
            else{
                left.add(arr.get(i));
            }
        }

        int x=preorder(left);
        int y=preorder(right);
        int z=pascal[n-1][left.size()];

        return (int)((((long)x*y)%mod*z)%mod);
    }
}