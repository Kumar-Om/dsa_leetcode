class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[]=new int[nums.length];
        int l=0,r=nums.length-1,idx=nums.length-1;
        while(l<=r){
            int leftSq=nums[l]*nums[l];
            int rightSq=nums[r]*nums[r];
            if(leftSq>rightSq){
                res[idx]=leftSq;
                idx--;l++;
            }
            else{
                res[idx]=rightSq;
                idx--;r--;
            }
        }
        return res;
    }
}