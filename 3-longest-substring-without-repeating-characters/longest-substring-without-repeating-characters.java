class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()==0)return 0;
        int l=0;
        int r=1;
        int maxi=1;
        map.put(s.charAt(0),0);

        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r))<l){
                    map.put(s.charAt(r),r);
                }
                else{
                    l=map.get(s.charAt(r))+1;
                    map.put(s.charAt(r),r);
                }
            }
            else{
                map.put(s.charAt(r),r);
                
            }
            maxi=Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}