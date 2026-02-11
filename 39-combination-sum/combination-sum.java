class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        int n=candidates.length;
        List<Integer> temp=new ArrayList<>();
        combinationSum(candidates,res,temp,target,0,n);
        return res;
    }

    void combinationSum(int[] candidates, List<List<Integer>> res,List<Integer> temp,int target,int i,int n){
        if(i==n){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(candidates[i]<=target){
            temp.add(candidates[i]);
            combinationSum(candidates,res,temp,target-candidates[i],i,n);
            temp.remove(temp.size()-1);

        }
        combinationSum(candidates,res,temp,target,i+1,n);
        
    }
}