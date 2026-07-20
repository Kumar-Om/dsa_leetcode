class Solution {
    public String minWindow(String s, String t) {
        int need[]=new int[256];
        int have[]=new int[256];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            need[ch]++;
        }
        int low=0,high=0,mini=Integer.MAX_VALUE;
        String res="";
        while(high<s.length()){
            char ch=s.charAt(high);
            have[ch]++;
            while(check(have,need)){
                if(high-low+1<mini){
                    mini=high-low+1;
                    res=s.substring(low,low+mini);
                }
                have[s.charAt(low)]--;
                low++;
            }
            high++;
        }
        return res;
    }

    public boolean check(int have[],int need[]){
        for(int i=0;i<256;i++){
            if(have[i]<need[i])return false;
        }
        return true;
    }
}