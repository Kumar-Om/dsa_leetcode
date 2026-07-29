class Solution {
    HashMap<Integer,Integer>map=new HashMap<>();
    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    public int climbStairs(int i, int n) {
        if (i==n)return 1;
        if (i>n)return 0;

        if(map.containsKey(i))return map.get(i);

        int ans = climbStairs(i+1,n) + climbStairs(i+2,n);
        map.put(i,ans);
        return ans;
    }
}