class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxi=0,fmax=0;
        int n=s.length();
        int map[]=new int[26];

        //aaabbccd k=2
        while(r<n){
            char ch=s.charAt(r);
            map[ch-'A']++;
            fmax=Math.max(fmax,map[ch-'A']);
            if((r-l+1)-fmax > k){
                ch=s.charAt(l);
                map[ch-'A']--;
                
                l++;
            }
            if((r-l+1)-fmax<=k){
                maxi=Math.max(maxi,r-l+1);
                r++;
            }
        }
        return maxi;
    }
}