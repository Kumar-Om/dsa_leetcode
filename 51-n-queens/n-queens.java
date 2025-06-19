class Solution {
    List<List<String>>res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        List<String>board=new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder row=new StringBuilder();
            for(int j=0;j<n;j++){
                row.append(".");
            }
            board.add(row.toString());
        }
        sol(board,0);
        return res;
    }

    public void sol(List<String>board,int row){
        //goal state
        if(row==board.size()){
            res.add(new ArrayList<>(board));
            return;
        }

        //exploration st
        for(int i=0;i<board.size();i++){
            if(isValid(board,row,i)){
                //action
                StringBuilder r=new StringBuilder(board.get(row));
                r.setCharAt(i,'Q');
                board.set(row,r.toString());//replacing

                //recurr
                sol(board,row+1);

                //undo
                r.setCharAt(i,'.');
                board.set(row,r.toString());
            }
            
        }
    }

    public boolean isValid(List<String>board,int row,int col){
        //up dirn
        for(int i=row;i>=0;i--){
            if(board.get(i).charAt(col)=='Q')return false;
        }

        //right up diagonal
        for(int i=row,j=col;i>=0 && j<board.size();i--,j++){
            if(board.get(i).charAt(j)=='Q')return false;
        }

        //left up diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board.get(i).charAt(j)=='Q')return false;
        }
        return true;
    }
}