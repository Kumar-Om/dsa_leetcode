class Solution {
    int c=0;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        dfs(rooms,n,0,vis);

        if(c==n)return true;
        else return false;
    }

    public void dfs(List<List<Integer>>rooms,int n,int s,boolean vis[]){
        vis[s]=true;
        c++;
        for(int i=0;i<rooms.get(s).size();i++){
            if(vis[rooms.get(s).get(i)]==false){
                dfs(rooms,n,rooms.get(s).get(i),vis);
            }
        }
    }
}