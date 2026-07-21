class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int low=0,high=0,maxi=0,n=s.length();

        while(high<n){
            char ch=s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char c=s.charAt(low);
                map.put(c,map.get(c)-1);
                //if(map.get(c)==0)map.remove(c);
                low++;
            }
            maxi=Math.max(maxi,high-low+1);
            high++;
        }
        return maxi;

    }
}