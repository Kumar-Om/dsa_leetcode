class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]>res=new ArrayList<>();
        int i=1;
        int merge[]=intervals[0];

        while(i<intervals.length){
            if(intervals[i][0]<=merge[1]){
                merge[0]=Math.min(intervals[i][0],merge[0]);
                merge[1]=Math.max(intervals[i][1],merge[1]);
                i++;
            }
            else{
                res.add(merge);
                merge=intervals[i];
                i++;
            }

        }
        res.add(merge);
        return res.toArray(new int[res.size()][]);

    }
}