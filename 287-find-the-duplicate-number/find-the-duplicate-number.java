class Solution {
    public int findDuplicate(int[] nums) {
        int fast=nums[nums[0]],slow=nums[0];
        while(fast!=slow){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}