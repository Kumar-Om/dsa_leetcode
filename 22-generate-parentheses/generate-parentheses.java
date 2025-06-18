class Solution {
    List<String>res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder sb=new StringBuilder();
        parantheses(sb,0,0,n);
        return res;
    }
    public void parantheses(StringBuilder sb,int open,int close,int n){
        if(open==n && close==n){
            res.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            parantheses(sb,open+1,close,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            parantheses(sb,open,close+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}