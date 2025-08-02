class Solution {
    boolean hasCycle=false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=numCourses;
        int e=prerequisites.length;
        int k=0; //for res indexing
        int res[]=new int[V];

        for(int i=0;i<V;i++)adj.add(new ArrayList<>());

        for(int i=0;i<e;i++){
            int b=prerequisites[i][1];
            int a=prerequisites[i][0];

            adj.get(b).add(a);
        }


        boolean vis[]=new boolean[V];
        boolean inrecc[]=new boolean[V];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj,vis,inrecc,st,i);
            }
        }
        
        if(hasCycle==true){
            return new int[]{};
        }

        while(!st.isEmpty()){
            res[k++]=st.pop();
        }
        return res;

    }

    public void dfs(ArrayList<ArrayList<Integer>>adj,boolean vis[],boolean inrecc[],Stack<Integer>st,int u){
        vis[u]=true;
        inrecc[u]=true;

        for(int v:adj.get(u)){
            if(inrecc[v]==true){
                hasCycle=true;
                return;
            }
            else if(!vis[v]){
                dfs(adj,vis,inrecc,st,v);
            }
        }
        inrecc[u]=false;
        st.add(u);
        return;
    }
}