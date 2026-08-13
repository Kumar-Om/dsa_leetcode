class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s)){
                map.put(s,res.size());
                res.add(new ArrayList<>());
                res.get(map.get(s)).add(strs[i]);
            }
            else{
                res.get(map.get(s)).add(strs[i]);
            }
        }
        return res;
    }
}