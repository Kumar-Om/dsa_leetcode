class Solution {
    public int minBitFlips(int start, int goal) {
        int num = (start ^ goal);
        int cnt = 0;
        while(num>1){
            cnt += (num & 1); //check if odd
            num = num >> 1; //divide by 2
        }
        if(num == 1) cnt += 1;
        return cnt;


    }
}