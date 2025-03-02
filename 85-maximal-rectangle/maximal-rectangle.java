class Solution {
    public int Histogram(int arr[]){
        Stack<Integer>st=new Stack<>();
        int nse=0,pse=0,maxi=0,n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int ele=st.peek();
                st.pop();
                nse=i;
                pse=(st.isEmpty())?-1:st.peek();
                maxi=Math.max(maxi,(nse-pse-1)*arr[ele]);
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int ele=st.peek();
            st.pop();
            nse=n;
            pse=(st.isEmpty())?-1:st.peek();
            maxi=Math.max(maxi,(nse-pse-1)*arr[ele]);
        }
        return maxi;
    }
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int r=matrix.length;
        int c=matrix[0].length;
        int premat[][]=new int[r][c];
        for(int j=0;j<c;j++){
            int sum=0;
            for(int i=0;i<r;i++){
                sum=sum+((matrix[i][j])-'0'); //converting char to int
                if(matrix[i][j]=='0')sum=0;
                else premat[i][j]=sum;
                
            }
        }
        int maxi=0;
        for(int i=0;i<r;i++){
            maxi=Math.max(maxi,Histogram(premat[i]));
        }
        return maxi;
    }
}