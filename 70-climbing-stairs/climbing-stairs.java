class Solution {
    public int climbStairs(int n) {
        int ans=0;
        int next=1;
        int next_next=0;
        for(int i=n-1;i>=0;i--){
            ans=next+next_next;
            next_next=next;
            next=ans;
        }
        return ans;
    }
}