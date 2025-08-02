class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=numCourses;
        int e=prerequisites.length;

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int b=prerequisites[i][1];
            int a=prerequisites[i][0];

            adj.get(b).add(a);   //b-->a
        }
    

        //dfs
        boolean vis[]=new boolean[V];
        boolean inrecc[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i] && dfsCycle(adj,vis,inrecc,i)){
                return false;
            }
        }
        return true;
        
    }
    public boolean dfsCycle(ArrayList<ArrayList<Integer>>adj,boolean[] vis,boolean[] inrecc,int u){
        vis[u]=true;
        inrecc[u]=true;

        for(int v:adj.get(u)){
            if(!vis[v] && dfsCycle(adj,vis,inrecc,v)){
                return true;
            }
            else if(inrecc[v]==true){
                return true;
            }
        }
        inrecc[u]=false;
        return false;
    }
}