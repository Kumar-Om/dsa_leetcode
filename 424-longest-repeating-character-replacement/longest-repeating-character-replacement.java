class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int maxi=0,maxfreq=0;
        int l=0,r=0;
        while(r<s.length()){
            freq[s.charAt(r)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(r)-'A']);

            if((r-l+1-maxfreq)<=k){
                maxi=Math.max(maxi,r-l+1);
            }
            else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return maxi;
    }
}