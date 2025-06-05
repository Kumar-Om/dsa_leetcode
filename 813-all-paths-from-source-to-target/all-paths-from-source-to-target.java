class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        int target=graph.length-1;
        dfs(graph,0,target,path,res);
        return res;
    }

    void dfs(int[][]graph,int s,int t,List<Integer>path,List<List<Integer>>res){
        path.add(s);
        if(s==t){
            res.add(new ArrayList<>(path));
        }
        else{
            for(int i=0;i<graph[s].length;i++){
                dfs(graph,graph[s][i],t,path,res);
            }
        }
        path.remove(path.size()-1);
    }
}