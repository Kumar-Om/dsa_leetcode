class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int low=1,high=max,res=0;
        while(low<=high){
            int mid=(low+high)/2;
            long eatTime=hours(piles,mid);
            if(eatTime >h){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public long hours(int piles[],int speed){
        long res=0;
        for(int i=0;i<piles.length;i++){
            res+=piles[i]/speed;
            if(piles[i]%speed!=0){
                res++;
            }
        }
        return res;
    }
}