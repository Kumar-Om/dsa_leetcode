class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        generate(n,0,0,res,sb);
        return res;
    }
    public void generate(int n,int open,int close, ArrayList<String> res,StringBuilder sb){
        if(open==n && close==n){
            res.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append("(");
            generate(n,open+1,close,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            generate(n,open,close+1,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}