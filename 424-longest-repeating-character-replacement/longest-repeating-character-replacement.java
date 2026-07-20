class Solution {
    public int characterReplacement(String s, int k) {
        int low=0,high=0,maxi=0,n=s.length();
        int freq[]=new int[26];
        int maxFreq=0;
        while(high<n){
            char ch=s.charAt(high);
            freq[ch-'A']++;
            maxFreq=Math.max(freq[ch-'A'],maxFreq);

            while((high-low+1)-maxFreq>k){
                char c=s.charAt(low);
                freq[c-'A']--;
                low++;
            }
            maxi=Math.max(maxi,high-low+1);
            high++;
        }
        return maxi;
    }
}