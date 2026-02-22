class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return  solve(nums,k)-solve(nums,k-1);
    }
    public int solve(int nums[],int k){
        int l=0,r=0,count=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(r<nums.length){
            int n=nums[r];
            map.put(n,map.getOrDefault(n,0)+1);

            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            // if(map.size()<=k){    //not needed
            //     count+=r-l+1;
            // }

            count+=r-l+1;
            r++;
        }
        return count;
    }
}