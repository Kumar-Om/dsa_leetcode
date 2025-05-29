class Solution {
    public boolean isValidSerialization(String preorder) {
        String arr[]=preorder.split(",");
        int slot=1;
        for(int i=0;i<arr.length;i++){
            slot--;
            if(slot<0)return false;
            if(!arr[i].equals("#")){
                slot+=2;
            }
        }
        if(slot==0)return true;
        else return false;
    }
}