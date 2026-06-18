class Solution {
    public int getSum(int n){
        int sum=0;

        while(n>0){
            int r=n%10;
            sum+=r*r;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int fast=n,slow=n;
        while(fast!=1){
            slow=getSum(slow);
            fast=getSum(getSum(fast));
            
            if(fast==slow && slow!=1)return false;
        }
        return true;
    }
}