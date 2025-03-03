class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>dq=new ArrayDeque<>();
        int n=nums.length,j=0;
        int arr[]=new int[n-k+1];
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peek()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                arr[j]=nums[dq.getFirst()];
                j++;
            }
        }
        return arr;
    }
}