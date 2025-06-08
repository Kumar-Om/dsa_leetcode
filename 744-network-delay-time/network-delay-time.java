class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int v = n;
        int e = times.length;
      
      ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
      for(int i=0;i<=v;i++){
        graph.add(new ArrayList<>());
      }
      for(int i=0;i<e;i++){
        int s = times[i][0];
        int d = times[i][1];
        int w = times[i][2];
        graph.get(s).add(new Edge(s,d,w));
      }
    
      int res = dij(graph,v,e,k);
      return res;
    }
    public static int dij(ArrayList<ArrayList<Edge>> graph, int v, int e, int k){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[v+1];
        int[] cost = new int[v+1];
        for(int i=1;i<=v;i++){
        cost[i] = Integer.MAX_VALUE;
        }
        cost[k] = 0;
        pq.add(new Edge(k,k,0));
        while(!pq.isEmpty()){
            Edge E = pq.poll();
            if(!vis[E.d]){
                vis[E.d] = true;
                for(int i=0;i<graph.get(E.d).size();i++){
                    int weight = E.w;
                    Edge des = graph.get(E.d).get(i);
                    if(weight+des.w<cost[des.d]){//relaxation
                        cost[des.d] = weight+des.w;
                        pq.add(new Edge(E.d,des.d, cost[des.d]));
                    }
                }
            }
        }
        int max = 0;
        for(int i: cost){
            max = (i>max)?i:max;
        }
        
        if(max==Integer.MAX_VALUE) return -1;//Every vertex cannot be reached
        else return max;
    }
}

class Edge implements Comparable<Edge>{
  int s,d,w;
  Edge(int s, int d, int w){
    this.s = s;
    this.d = d;
    this.w = w;
  }
  public int compareTo(Edge a){
    return this.w-a.w;
  }
}