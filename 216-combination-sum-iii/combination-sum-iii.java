class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combinationSum3(res,temp,arr,k,n,0);
        return res;
    }
    public  void combinationSum3(List<List<Integer>> res,List<Integer> temp,int arr[],int k,int target,int idx){
        if(temp.size()==k){
            if(target==0){
                res.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i=idx;i<9;i++){
            if(arr[i]<=target){
                temp.add(arr[i]);
                combinationSum3(res,temp,arr,k,target-arr[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}