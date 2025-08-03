class Solution {
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int color[]=new int[V];
        Arrays.fill(color,-1);

        for(int i=0;i<V;i++){
            if(color[i]==-1 && isBipartiteDFS(graph,color,i,1)==false){
                return false;
            }
        }
        return true;
    }

    public boolean isBipartiteDFS(int[][] graph,int[] color,int u,int currcolor){
        color[u]=currcolor;

        for(int v:graph[u]){
            if(color[v]==currcolor)return false;

            else if(color[v]==-1){
                int colorOfV=1-currcolor;

                if(isBipartiteDFS(graph,color,v,colorOfV)==false)return false;
            }
        }
        return true;
    }
}