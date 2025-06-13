class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] path=new int[n];
        Arrays.fill(path,Integer.MAX_VALUE);
        path[src]=0;
        for(int i=0;i<=k;i++){
            int[]temp=Arrays.copyOf(path,n);
            for(int[] arr:flights){
                int s=arr[0];
                int d=arr[1];
                int w=arr[2];
                if(path[s]!=Integer.MAX_VALUE && path[s]+w<temp[d]){
                    temp[d]=path[s]+w;
                }
            }
            path=temp;
        }
        if(path[dst]==Integer.MAX_VALUE)return -1;
        else return path[dst];
    }
}


