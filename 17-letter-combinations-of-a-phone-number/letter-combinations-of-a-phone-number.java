class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> res=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        letterCombination(0,digits,map,res,sb);
        return res;
    }

    public void letterCombination(int idx,String digits,HashMap<Character,String> map,List<String> res,StringBuilder sb){
        if(idx>=digits.length()){
            res.add(sb.toString());
            return;
        }

        String ch=map.get(digits.charAt(idx));
        for(int i=0;i<ch.length();i++){
            sb.append(ch.charAt(i));
            letterCombination(idx+1,digits,map,res,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
}