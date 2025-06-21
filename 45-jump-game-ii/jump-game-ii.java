class Solution {
    public int jump(int[] nums) {
        int jumps=0,max=0,min=0;
        while(max<nums.length-1){
            int reach=0;
            for(int i=min;i<=max;i++){
                reach=Math.max(reach,nums[i]+i);
            }
            min=max+1;
            max=reach;
            jumps++;
        }
        return jumps;
    }
}