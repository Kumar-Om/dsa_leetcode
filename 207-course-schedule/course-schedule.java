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
        //Khans algo ->cycle detection(bfs)
        int c=0;

        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int v:adj.get(i)){
                indegree[v]++;
            }
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
                c++;
            }
        }

        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                    c++;
                }
            }
        }

        if(c==V) return true; //no cycle
        else return false;// cycle exists
    }
}