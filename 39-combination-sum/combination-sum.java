class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        combinationSum(candidates,target,0,res,temp,candidates.length);
        return res;
    }
    public void combinationSum(int candidates[],int target,int idx,List<List<Integer>> res,List<Integer>temp,int n){
        if(idx==n){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[idx]<=target){
            temp.add(candidates[idx]);
            combinationSum(candidates,target-candidates[idx],idx,res,temp,n);
            temp.remove(temp.size()-1);
        }

        combinationSum(candidates,target,idx+1,res,temp,n);
        //return;
    }
}