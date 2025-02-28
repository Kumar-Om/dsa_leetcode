class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            while(!st.isEmpty() && k>0 && (c-'0')<(st.peek()-'0')){
                st.pop();
                k--;
            }
            st.push(c);
        }

        while(k>0){
            st.pop();
            k--;
        }
        String res="";
        while(!st.isEmpty()){
            res+=st.peek();
            st.pop();
        }

        res=res.replaceAll("0+$","");//to remove zeros from back
        if(res.isEmpty())return "0"; // if all zeros 

        StringBuilder sb=new StringBuilder(res);
        return sb.reverse().toString();
    }
}