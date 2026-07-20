class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int low=0,high=0,maxi=Integer.MIN_VALUE,n=fruits.length;

        while(high<n){
            int a=fruits[high];
            map.put(a,map.getOrDefault(a,0)+1);
            while(map.size()>2){
                int b=fruits[low];
                map.put(b,map.get(b)-1);
                if(map.get(b)==0)map.remove(b);
                low++;
            }
            if(map.size()<=2){
                maxi=Math.max(maxi,high-low+1);
            }
            high++;
        }
        return maxi;
    }
}