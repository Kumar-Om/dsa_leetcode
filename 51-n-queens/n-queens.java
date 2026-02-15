class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res= new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        solve(0,n,res,board);
        return res;
    }
    public boolean isSafe(int row,int col,int n,char[][]board){
        for(int j=col;j>=0;j--){
            if(board[row][j]=='Q')return false;
        }

        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }

        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }

    public void solve(int col,int n,List<List<String>> res,char board[][]){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(row,col,n,board)){
                board[row][col]='Q';
                solve(col+1,n,res,board);
                board[row][col]='.';
            }
        }
    }
}