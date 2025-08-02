class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int c=0;
        boolean[] vis=new boolean[n];

        for(int i=0;i<n;i++){
            if(!vis[i]){
                c++;
                bfs(isConnected,i,vis,n);
            }
        }
        return c;
    }

    public void bfs(int[][] isConnected,int u,boolean[]vis,int n){
        Queue<Integer>q=new LinkedList<>();
        vis[u]=true;
        q.add(u);

        while(!q.isEmpty()){
            int U=q.poll();
            for(int v=0;v<n;v++){
                if(!vis[v] && isConnected[U][v]==1){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
    }
}