class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch))sb.append(Character.toLowerCase(ch));
        }

        return valid(sb.toString(),0,sb.length()-1);
    }
    public boolean valid(String s,int l,int r){
        if(l>=r)return true;
        if(s.charAt(l)!=s.charAt(r))return false;

        return valid(s,++l,--r);
    }
}