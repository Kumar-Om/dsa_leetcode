class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        solve(res,board,0,n);
        return res;
    }
    public void solve(List<List<String>> res,char board[][],int col,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int row=0;row<n;row++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                solve(res,board,col+1,n);
                board[row][col]='.';
            }
        }
    }

    public boolean isSafe(char board[][],int row,int col,int n){
        //same row check
        for(int j=col;j>=0;j--){
            if(board[row][j]=='Q')return false;
        }
        
        //upper left diagonal check
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }

        //lower left diagonal check
        for(int i=row,j=col;i<n && j>=0;i++,j--){
            if(board[i][j]=='Q')return false;
        }

        return true;
    }
}