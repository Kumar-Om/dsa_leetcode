class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int l=0,r=0,maxLen=0,maxfreq=0;

        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxfreq=Math.max(freq[ch-'A'],maxfreq);
            if(r-l+1-maxfreq <= k){
                maxLen=Math.max(maxLen,r-l+1);
            }
            else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return maxLen;
    }
}