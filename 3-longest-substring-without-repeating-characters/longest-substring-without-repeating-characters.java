class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();  // stores character and index 
        if(s.length()==0)return 0;
        int maxi=1,l=0,r=1;
        map.put(s.charAt(0),0);

        while(r<s.length()){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)<l){
                    map.put(ch,r);
                }
                else{
                    l=map.get(ch)+1;
                    map.put(ch,r);

                }
            }
            else{
                map.put(ch,r);
            }
            maxi=Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;

    }
}