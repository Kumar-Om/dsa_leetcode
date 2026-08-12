class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[j]){
                sb.append(chars[j]);
                int len=i-j;

                if(len>1)sb.append(len);
                j=i;
            }
        }
        sb.append(chars[j]);
        int len=chars.length-j;
        if(len>1)sb.append(len);

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        
        return sb.length();
    }
}