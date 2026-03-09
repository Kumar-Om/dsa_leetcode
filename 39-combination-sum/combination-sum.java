class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combinationSum(candidates,target,res,temp,0,candidates.length);
        return res;
    }

    public void combinationSum(int[] candidates,int target,List<List<Integer>> res,List<Integer> temp,int i,int n){
        if(i==n){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        if(candidates[i]<=target){
            temp.add(candidates[i]);
            combinationSum(candidates,target-candidates[i],res,temp,i,n);
            temp.remove(temp.size()-1);
        }

        combinationSum(candidates,target,res,temp,i+1,n);
    }
}