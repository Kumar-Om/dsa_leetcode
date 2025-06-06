class Edge implements Comparable<Edge>{
    int s,d,w;
    Edge(int s,int d,int w){
        this.s=s;
        this.d=d;
        this.w=w;
    }
    public int compareTo(Edge that){
        return this.w-that.w;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int v=points.length;
        int graph[][]=new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                int w=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);
                graph[i][j]=w;
                graph[j][i]=w;
            }
        }

        return prims(graph,v);
    }

    public static int prims(int[][]graph,int v){
        PriorityQueue<Edge>pq=new PriorityQueue<>();
        boolean vis[]=new boolean[v];
        int sum=0;
        pq.add(new Edge(0,0,0));

        while(!pq.isEmpty()){
            Edge temp=pq.poll();
            if(!vis[temp.d]){
                vis[temp.d]=true;
                sum+=temp.w;
                for(int i=0;i<v;i++){
                    int weight=graph[temp.d][i];
                    if(!vis[i]){
                        pq.add(new Edge(temp.d,i,weight));
                    }
                }
            }
        }
        return sum;
    }
}