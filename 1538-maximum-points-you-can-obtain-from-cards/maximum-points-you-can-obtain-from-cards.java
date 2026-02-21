class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxi=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxi=lsum;
        int ridx=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            rsum+=cardPoints[ridx];
            lsum-=cardPoints[i];
            ridx--;
            maxi=Math.max(maxi,rsum+lsum);
        }
        return maxi;
    }
}