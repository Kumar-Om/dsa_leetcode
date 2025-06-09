class Solution {
    public int maximumProduct(int[] nums) {
        int M1=Integer.MIN_VALUE;
        int M2=Integer.MIN_VALUE;
        int M3=Integer.MIN_VALUE;
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>M1){
                M3=M2;
                M2=M1;
                M1=nums[i];
            }
            else if(nums[i]>M2){
                M3=M2;
                M2=nums[i];
            }
            else if(nums[i]>M3){
                M3=nums[i];
            }

            if(nums[i]<m1){
                m2=m1;
                m1=nums[i];
            }
            else if(nums[i]<m2){
                m2=nums[i];
            }
        }
        int p1=M1*M2*M3;
        int p2=m1*m2*M1;

        return Math.max(p1,p2);

    }
}