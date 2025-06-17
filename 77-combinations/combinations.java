class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;        
        }
        boolean used[]=new boolean[n];
        List<Integer>temp=new ArrayList<>();
        combination(nums,used,temp,k,0);
        return res;
    }
    public void combination(int nums[],boolean[]used,List<Integer>temp,int k,int idx){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            if(used[i]==false){
                temp.add(nums[i]);
                used[i]=true;

                combination(nums,used,temp,k,i+1);

                temp.remove(temp.size()-1);
                used[i]=false;
            }
        }
    }
}