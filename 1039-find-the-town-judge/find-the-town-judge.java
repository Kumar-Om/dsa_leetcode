class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int s=trust[i][0];
            int d=trust[i][1];
            arr[s]--;
            arr[d]++;
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]==n-1)return i;
        }
        return -1;
    }
}