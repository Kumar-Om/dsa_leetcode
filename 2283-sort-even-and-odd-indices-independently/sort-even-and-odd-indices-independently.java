class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=i+2;j<n;j+=2){
                    if(nums[i]>nums[j]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
            else{
                for(int j=i+2;j<n;j+=2){
                    if(nums[i]<nums[j]){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }
        return nums;
    }
}