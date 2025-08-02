class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int c=0;
        boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                dfs(isConnected,i,vis,n);
            }
        }
        return c;
    }

    public void dfs(int[][] isConnected,int u,boolean[]vis,int n){
        vis[u]=true;
        for(int v=0;v<n;v++){
            if(!vis[v] &&  isConnected[u][v]==1){
                dfs(isConnected,v,vis,n);

            }
        }
    }
}