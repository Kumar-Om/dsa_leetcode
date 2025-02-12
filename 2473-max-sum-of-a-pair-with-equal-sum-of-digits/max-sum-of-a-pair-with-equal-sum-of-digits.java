class Solution {
    public int digiSum(int n){
        int s=0,r=0;
        while(n!=0){
            r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int maxi=-1;
        for(int i=0;i<nums.length;i++){
            int s=digiSum(nums[i]);
            if(map.containsKey(s)){
                int res=map.get(s)+nums[i];
                maxi=Math.max(maxi,res);
                map.put(s,Math.max(map.get(s),nums[i]));
            }
            else{
                map.put(s,nums[i]);
            }
        }
        return maxi;
    }
}