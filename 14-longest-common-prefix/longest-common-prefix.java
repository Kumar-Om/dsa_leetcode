class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        char f[]=strs[0].toCharArray();
        char l[]=strs[strs.length-1].toCharArray();
        for(int i=0;i<f.length;i++){
            if(f[i]!=l[i]){
                break;
            }
            sb.append(f[i]);
        } 
        return sb.toString();
    }
}