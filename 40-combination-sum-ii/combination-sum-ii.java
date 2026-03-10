class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(candidates,res,temp,target,0,candidates.length);
        return res;

    }
    public void combinationSum(int candidates[],List<List<Integer>> res,List<Integer> temp,int target,int idx,int n){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<n;i++){
            if(i>idx && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target)break;
            
            temp.add(candidates[i]);
            combinationSum(candidates,res,temp,target-candidates[i],i+1,n);
            temp.remove(temp.size()-1);
            
        }
    }
}