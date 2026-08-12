class Solution {
    public int expand(String s, int l,int r){
        while(l>=0 && r<s.length()){
            if(s.charAt(l)==s.charAt(r)){
                l--;r++;
            }
            else break;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) {
        int start=0,end=0,n=s.length();
        String res="";
        for(int i=0;i<n;i++){
            int len1=expand(s,i,i); //odd palindrome
            int len2=expand(s,i,i+1);//even paindrome
            int len=Math.max(len1,len2);

            if(len>=end-start+1){
                start= i-(len-1)/2;
                end=i+len/2;
                res=s.substring(start,end+1);
            }
        }
        return res;
    }
}