class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))return true;
        int c=0;
        char first1=' ',second1=' ',first2=' ',second2=' ';
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(c==1){
                first1=s1.charAt(i);
                first2=s2.charAt(i);
                }
                if(c==2){
                    second1=s1.charAt(i);
                    second2=s2.charAt(i);
                }
            }
            
        }
        if(c==2&&first1==second2 && second1==first2){
            return true;
        }
        return false;
    }
}