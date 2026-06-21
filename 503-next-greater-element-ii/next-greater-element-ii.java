class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int res[]=new int[n];

        st.push(nums[n-1]);
        //1 2 1, 1 2 1
        for(int i=2*n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty())res[i]=-1;
                else{
                    res[i]=st.peek();
                }
            }
            st.push(nums[i%n]);
            
        }
        return res;
    }
}