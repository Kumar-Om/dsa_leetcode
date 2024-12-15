class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();

        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        int f=0;
        for(int i=0;i<s1.length;i++){
            if(map.containsKey(s1[i])){
                if(map.get(s1[i])!=s2[i]){
                    f=1;
                }
            }
            else{
                map.put(s1[i],s2[i]);
            }

            if(map2.containsKey(s2[i])){
                if(map2.get(s2[i])!=s1[i]){
                    f=1;
                }
            }
            else{
                map2.put(s2[i],s1[i]);
            }
        }
        if(f==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}