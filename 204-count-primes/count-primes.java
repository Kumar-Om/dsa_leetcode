class Solution {
    public int countPrimes(int n) {
        int c=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i=2;i<n;i++){
            if(arr[i]==1){
                for(int j=i*2;j<n;j=j+i){
                    arr[j]=0;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(arr[i]==1)c++;
        }
        return c;
    }
}