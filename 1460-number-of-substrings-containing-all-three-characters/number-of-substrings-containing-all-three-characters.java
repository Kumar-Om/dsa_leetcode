class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int arr[]={-1,-1,-1}; //a b c
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                count=count+(1+Math.min(arr[0],Math.min(arr[1],arr[2])));
            }
        }
        return count;

    }
}