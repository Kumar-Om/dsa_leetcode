class Solution {
    public int findCenter(int[][] edges) {
        int s=edges[0][0];
        int d=edges[0][1];
        if(s==edges[1][0] || s==edges[1][1])return s;
        else return d;
    }
}