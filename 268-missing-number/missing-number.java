class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0,xor2=0;
        for(int i=1;i<nums.length+1;i++){
            xor1=xor1^i;
            
        }
        for(int i=0;i<nums.length;i++){
            xor2=xor2^nums[i];
        }
        

        return xor1^xor2;

    }
}