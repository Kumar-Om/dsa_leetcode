class Solution {
    public int trap(int[] heights) {
        int n=heights.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        leftmax[0]=heights[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],heights[i]);
        }
        rightmax[n-1]=heights[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],heights[i]);
        }

        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(leftmax[i],rightmax[i])-heights[i];
        }
        return res;
    }
}