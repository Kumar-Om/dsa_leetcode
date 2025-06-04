class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        //adjacency list
        List<List<Integer>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        int e=edges.size();
        for(int i=0;i<e;i++){
            int s=edges.get(i).get(0);
            int d=edges.get(i).get(1);

            graph.get(d).add(s); //store dest to source 
        }
    
        List<Integer>res=new ArrayList<>();  // add to res whichever col size id 0
        for(int i=0;i<n;i++){
            if(graph.get(i).size()==0){
                res.add(i);
            }
        }

        return res;
    }
}