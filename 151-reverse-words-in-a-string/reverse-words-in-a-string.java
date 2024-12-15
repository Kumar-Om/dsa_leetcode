class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split(" +");
        int r=arr.length-1;
        String ar="";
        
        while(r>0){
            ar+=arr[r]+" ";
            
            r--;
        }
        ar+=arr[0];
        
        return ar;
    }
}