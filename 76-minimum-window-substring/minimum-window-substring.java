class Solution {
    public String minWindow(String s, String t) {
        int high=0,low=0;
        int minLen=Integer.MAX_VALUE;
        int need[]=new int[256];
        int have[]=new int[256];
        String res="";

        for(int i=0;i<t.length();i++){
            need[t.charAt(i)]++;
        }

        while(high<s.length()){
            have[s.charAt(high)]++;
            
            while(check(need,have)){
                if(high-low+1<minLen){
                    minLen=high-low+1;
                    res=s.substring(low,low+minLen);
                }
                have[s.charAt(low)]--;
                low++;
            }
            high++;
        }
        return res;
    }

    public boolean check(int need[],int have[]){
        for(int i=0;i<256;i++){
            if(have[i]<need[i]) return false;
        }
        return true;
    }
}