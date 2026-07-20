
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        //prefix sum
        for(int i=1;i<n;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        //1 3 6  k=3
        for(int i=0;i<n;i++){
            int key=nums[i]-k;
            if(map.containsKey(key)){
                c+=map.get(key);
            }
            
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
        }
        return c;
    }
}