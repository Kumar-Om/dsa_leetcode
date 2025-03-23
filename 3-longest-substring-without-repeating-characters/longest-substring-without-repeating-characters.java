class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,maxi=0,n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<n){
            //cadbzabcd
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>=l){
                    l=map.get(ch)+1;  
                }
            }
            map.put(ch,r);
            maxi=Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}