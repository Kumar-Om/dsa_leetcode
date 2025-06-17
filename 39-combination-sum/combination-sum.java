class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>temp=new ArrayList<>();
        combination(candidates,target,temp,0);
        return res;
    }

    public void combination(int candidates[],int target,List<Integer>temp,int idx){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(candidates[i]<=target){
                temp.add(candidates[i]);
                combination(candidates,target-candidates[i],temp,i);
                temp.remove(temp.size()-1);
            }
        }
    }
}