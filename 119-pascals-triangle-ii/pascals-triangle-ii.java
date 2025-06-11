class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>ans=new ArrayList<>();
        ans.add(1);
        int mul=rowIndex;
        long res=1L;
        for(int r=1;r<=rowIndex;r++){
            res=res*mul/r;
            mul--;
            ans.add((int)res);
        }
        return ans;
    }
}