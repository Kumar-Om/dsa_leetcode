class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        //sum=left+right+nums[i]

        if(sum-nums[0]==0)return 0;

        for(int i=1;i<nums.length;i++){
            left=left+nums[i-1];
            int right=sum-left-nums[i];
            if(left==right)return i;
        }
        return -1;
    }
}