class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();

    }
}