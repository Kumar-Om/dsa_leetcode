class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=numCourses;
        int e=prerequisites.length;
        int res[]=new int[V];

        for(int i=0;i<V;i++)adj.add(new ArrayList<>());

        for(int i=0;i<e;i++){
            int b=prerequisites[i][1];
            int a=prerequisites[i][0];

            adj.get(b).add(a);
        }

        //khans algo
        Queue<Integer>q=new LinkedList<>();
        int c=0; 
        int k=0; //for res index

        int indegree[]=new int[V];
        for(int i=0;i<V;i++){
            for(int v:adj.get(i)){
                indegree[v]++;
            }
        }

        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                c++;
                q.add(i);
                res[k++]=i;
            }
        }

        while(!q.isEmpty()){
            int u=q.poll();
            for(int v:adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    c++;
                    q.add(v);
                    res[k++]=v;
                }
            }
        }

        if(c==V)return res;
        else return new int[]{};


    }
}