class Solution {
    public int longestValidParentheses(String s) {
        int maxi=0;
        Stack<Integer>st=new Stack<>();
        int n=s.length();
        st.push(-1);
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')st.push(i);
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int diff=i-st.peek();
                    maxi=Math.max(maxi,diff);
                }
            }
        }
        return maxi;
    }
}