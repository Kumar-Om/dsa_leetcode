class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=1,j=0;
        while(i<nums.length){
            if(nums[i]==nums[i-1]){
                i++;
            }
            else{
                nums[j+1]=nums[i];
                count++;
                j++;i++;
            }

        }

        return count;
    }
}