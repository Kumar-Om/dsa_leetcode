class Solution {
    public int[] nextSE(int arr[]){
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int res[]=new int[arr.length];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=n;
            }
            else{
                res[i]=st.peek();
            }
            st.push(i);
        }
        return res;
    }

    public int[] prevSE(int arr[]){
        int res[]=new int[arr.length];
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=st.peek();
            }

            st.push(i);
        }
        return res;
    }
    public int sumSubarrayMins(int[] arr) {
        int[]nse=nextSE(arr);
        int[]pse=prevSE(arr);
        long tot=0;
        long mod=1000000007;

        for(int i=0;i<arr.length;i++){
            int right=nse[i]-i;
            int left=i-pse[i];

            tot=(tot+((right*left)%mod)*arr[i]%mod)%mod;
        }
        return (int)tot;
    }
}