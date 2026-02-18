class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zero = 0;
        int maxi = 0;
        while (r < nums.length) {
            if (nums[r] == 0) {
                zero++;
            }
            if (zero <= k) {
                maxi = Math.max(maxi, r - l + 1);
            } else {
                if(nums[l]==0)zero--;
                l = l + 1;
            }
            r++;
        }
        return maxi;
    }
    
}