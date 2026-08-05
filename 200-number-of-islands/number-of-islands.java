class Solution {
    int x[]={0,0,-1,1};//left right up down =>for row
    int y[]={-1,1,0,0};//left right up down => for col
        
    public void dfs(char grid[][],int i,int j,boolean vis[][],int r,int c){
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            int row=i+x[k];
            int col=j+y[k];
            if(isValid(row,col,r,c) && grid[row][col]=='1' && vis[row][col]==false){
                dfs(grid,row,col,vis,r,c);
            }
        }
    }
    public boolean isValid(int i,int j,int r,int c){
        if(i<0 || i>=r ||j<0||j>=c)return false;
        return true;
    }
    public int numIslands(char[][] grid) {
        
        int r=grid.length,c=grid[0].length;
        boolean vis[][]=new boolean[r][c];
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1' && vis[i][j]==false){
                    dfs(grid,i,j,vis,r,c);
                    count++;
                }
            }
        }
        return count;
    }
}








