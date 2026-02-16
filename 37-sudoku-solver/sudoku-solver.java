class Solution {
    public void solveSudoku(char[][] board) {
        sol(board);
    }

    public boolean sol(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if (isValid(board,c,i,j)){
                            board[i][j]=c;
                            if(sol(board)==true)return true;
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(char board[][],char num,int row,int col){
        for(int i=0;i<9;i++){
            if(board[row][i]==num)return false;

            if(board[i][col]==num)return false;
        }

        int boxRow=3*(row/3);
        int boxCol=3*(col/3); 

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[boxRow+i][boxCol+j]==num)return false;
            }
        }

        return true;
    }
}
