class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0,maxFreq=0;
        int l=0,r=0;

        int freq[]=new int[26];
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);

            if((r-l+1)-maxFreq <=k ){
                maxLen=Math.max(maxLen,r-l+1);
            }
            else{
                ch=s.charAt(l);
                freq[ch-'A']--;
                l++;
            }
            r++;
        }
        return maxLen;
    }
}