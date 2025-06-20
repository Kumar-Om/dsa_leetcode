class Solution {
    public void solveSudoku(char[][] board) {
        sol(board);
    }
    public boolean sol(char board[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char num='1';num<='9';num++){
                        if(isValid(board,i,j,num)){
                            board[i][j]=num;
                            if(sol(board))return true;
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char[][]board,int row,int col,int num){
        for(int i=0;i<9;i++){
            if(board[row][i]==num || board[i][col]==num)return false;
        }

        int boxrow=row/3*3;
        int boxcol=col/3*3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[boxrow+i][boxcol+j]==num)return false;
            }
        }
        return true;
    }
}