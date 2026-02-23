class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0,mini=Integer.MAX_VALUE,idx=-1;
        int count=0;

        int freq[]=new int[256];
        Arrays.fill(freq,0);
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }

        while(r<s.length()){
            if(freq[s.charAt(r)]>0){
                count+=1;
            }
            freq[s.charAt(r)]--;
            while(count==t.length()){
                if(r-l+1 < mini){
                    mini=r-l+1;
                    idx=l;
                }
                freq[s.charAt(l)]++;
                if(freq[s.charAt(l)] > 0){
                    count-=1;
                }
                l++;
            }
            r++;

        }
        return idx==-1?"":s.substring(idx,idx+mini);

    }
}